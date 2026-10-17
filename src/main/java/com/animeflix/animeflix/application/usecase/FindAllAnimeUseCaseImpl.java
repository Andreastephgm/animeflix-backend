package com.animeflix.animeflix.application.usecase;

import com.animeflix.animeflix.application.port.in.FindAllAnimeUseCase;
import com.animeflix.animeflix.application.port.out.AnimeFindAllRepositoryPort;
import com.animeflix.animeflix.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindAllAnimeUseCaseImpl implements FindAllAnimeUseCase {

    private final AnimeFindAllRepositoryPort animeFindAllRepositoryPort;

    public FindAllAnimeUseCaseImpl(AnimeFindAllRepositoryPort animeFindAllRepositoryPort) {
        this.animeFindAllRepositoryPort = animeFindAllRepositoryPort;
    }


    @Override
    public List<Anime> findAll() {
        return animeFindAllRepositoryPort.findAll() ;
    }
}
