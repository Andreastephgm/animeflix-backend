package com.animeflix.animeflix.application.usecase;

import com.animeflix.animeflix.application.port.in.SaveAnimeUseCase;
import com.animeflix.animeflix.application.port.out.AnimeSaveRepositoryPort;
import com.animeflix.animeflix.domain.Anime;
import org.springframework.stereotype.Service;

@Service
public class SaveAnimeUseCaseImpl implements SaveAnimeUseCase {

    private final AnimeSaveRepositoryPort animeSaveRepositoryPort;

    public SaveAnimeUseCaseImpl(AnimeSaveRepositoryPort animeSaveRepositoryPort) {
        this.animeSaveRepositoryPort = animeSaveRepositoryPort;
    }

    @Override
    public Anime save(Anime anime) {
        return animeSaveRepositoryPort.save(anime);
    }
}
