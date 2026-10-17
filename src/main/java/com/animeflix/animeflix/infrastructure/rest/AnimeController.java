package com.animeflix.animeflix.infrastructure.rest;

import com.animeflix.animeflix.application.port.in.*;
import com.animeflix.animeflix.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animes")
public class AnimeController {

    private final FindAnimeByIdUseCase findAnimeByIdUseCase;
    private final FindAllAnimeUseCase findAllAnimeUseCase;
    private final SaveAnimeUseCase saveAnimeUseCase;
    private final UpdateAnimeUseCase updateAnimeUseCase;
    private final DeleteAnimeUseCase deleteAnimeUseCase;

    public AnimeController(FindAnimeByIdUseCase findAnimeByIdUseCase, FindAllAnimeUseCase findAllAnimeUseCase, SaveAnimeUseCase saveAnimeUseCase, UpdateAnimeUseCase updateAnimeUseCase, DeleteAnimeUseCase deleteAnimeUseCase) {
        this.findAnimeByIdUseCase = findAnimeByIdUseCase;
        this.findAllAnimeUseCase = findAllAnimeUseCase;
        this.saveAnimeUseCase = saveAnimeUseCase;
        this.updateAnimeUseCase = updateAnimeUseCase;
        this.deleteAnimeUseCase = deleteAnimeUseCase;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Anime>> getAllAnimes(){
        List<Anime> animes =  findAllAnimeUseCase.findAll();
        return ResponseEntity.ok(animes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anime> getAnimeById(@PathVariable String id) {
        return findAnimeByIdUseCase.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/new")
    public ResponseEntity<Anime> createAnime(@RequestBody Anime anime){
        Anime savedAnime = saveAnimeUseCase.save(anime);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAnime);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Anime> createAnime(@PathVariable String id, @RequestBody Anime anime){
        return updateAnimeUseCase.updateAnime(id, anime)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        deleteAnimeUseCase.deleteById(id);
    }



}
