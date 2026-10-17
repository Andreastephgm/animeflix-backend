package com.animeflix.animeflix.application.usecase;

import com.animeflix.animeflix.application.port.in.FindAnimeByIdUseCase;
import com.animeflix.animeflix.application.port.out.AnimeFindAllRepositoryPort;
import com.animeflix.animeflix.application.port.out.AnimeFindByIdRepositoryPort;
import com.animeflix.animeflix.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FindAnimeByIdUseCaseImpl implements FindAnimeByIdUseCase {

    private final AnimeFindByIdRepositoryPort animeFindByIdRepositoryPort;

    public FindAnimeByIdUseCaseImpl(AnimeFindByIdRepositoryPort animeFindByIdRepositoryPort) {
        this.animeFindByIdRepositoryPort = animeFindByIdRepositoryPort;
    }


    @Override
    public Optional<Anime> findById(String id) {
        return animeFindByIdRepositoryPort.findById(id);
    }
}
