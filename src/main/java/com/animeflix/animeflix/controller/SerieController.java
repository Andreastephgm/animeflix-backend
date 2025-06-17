package com.animeflix.animeflix.controller;

import com.animeflix.animeflix.model.Serie;
import com.animeflix.animeflix.service.SerieService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class SerieController {
    private final SerieService serieService;

    public SerieController(SerieService serieService) {
        this.serieService = serieService;
    }

    @PostMapping
    public Serie createSerie(@RequestBody Serie serie){
        return serieService.createSerie(serie);
    }

    @GetMapping
    public List<Serie> listSerie(){
        return  serieService.listSeries();
    }

    @GetMapping("/{id}")
    public Optional<Serie> findSerieById(@PathVariable Long id){
        return serieService.findSerieById(id);
    }

    @PutMapping
    public Serie updateSerie(@RequestBody Serie serie, @PathVariable Long id){
        return serieService.updateSerie(serie, id);
    }

    @DeleteMapping("/{id}")
    public void deleteSerie(@PathVariable Long id){
        serieService.deleteSerie(id);
    }
}
