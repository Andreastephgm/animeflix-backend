package com.animeflix.animeflix.application.port.out;

import com.animeflix.animeflix.domain.Anime;

import java.util.Optional;

public interface AnimeUpdateRepositoryPort {

    Optional<Anime> updateAnime(String id, Anime anime);
}
