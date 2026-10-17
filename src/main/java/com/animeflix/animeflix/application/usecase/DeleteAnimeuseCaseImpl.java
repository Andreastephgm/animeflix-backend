package com.animeflix.animeflix.application.usecase;

import com.animeflix.animeflix.application.port.in.DeleteAnimeUseCase;
import com.animeflix.animeflix.application.port.out.AnimeDeleteRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class DeleteAnimeuseCaseImpl implements DeleteAnimeUseCase {

    private final AnimeDeleteRepositoryPort animeDeleteRepositoryPort;

    public DeleteAnimeuseCaseImpl(AnimeDeleteRepositoryPort animeDeleteRepositoryPort) {
        this.animeDeleteRepositoryPort = animeDeleteRepositoryPort;
    }

    @Override
    public void deleteById(String id) {
        animeDeleteRepositoryPort.deleteById(id);
    }
}
