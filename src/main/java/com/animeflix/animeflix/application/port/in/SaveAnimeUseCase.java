package com.animeflix.animeflix.application.port.in;

import com.animeflix.animeflix.domain.Anime;

public interface SaveAnimeUseCase {
    Anime save(Anime anime);
}
