package com.animeflix.animeflix.application.port.in;

import com.animeflix.animeflix.domain.Anime;

import java.util.Optional;

public interface UpdateAnimeUseCase {
    Optional<Anime> updateAnime(String id, Anime anime);
}
