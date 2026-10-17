package com.animeflix.animeflix.application.usecase;

import com.animeflix.animeflix.application.port.in.UpdateAnimeUseCase;
import com.animeflix.animeflix.application.port.out.AnimeFindByIdRepositoryPort;
import com.animeflix.animeflix.application.port.out.AnimeUpdateRepositoryPort;
import com.animeflix.animeflix.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateAnimeUseCaseImpl implements UpdateAnimeUseCase {

    private final AnimeUpdateRepositoryPort animeUpdateRepositoryPort;
    private final AnimeFindByIdRepositoryPort findByIdRepositoryPort;

    public UpdateAnimeUseCaseImpl(AnimeUpdateRepositoryPort animeUpdateRepositoryPort,
                                  AnimeFindByIdRepositoryPort findByIdRepositoryPort) {
        this.animeUpdateRepositoryPort = animeUpdateRepositoryPort;
        this.findByIdRepositoryPort = findByIdRepositoryPort;
    }

    @Override
    public Optional<Anime> updateAnime(String id, Anime anime) {
        return findByIdRepositoryPort.findById(id).flatMap(
                existingAnime -> {
                    anime.setId(id);
                    return animeUpdateRepositoryPort.updateAnime(id, anime);
                }
        );
    }
}
