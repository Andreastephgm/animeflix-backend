package com.animeflix.animeflix.application.port.out;

import com.animeflix.animeflix.domain.Anime;

public interface AnimeSaveRepositoryPort {
    Anime save(Anime anime);
}
