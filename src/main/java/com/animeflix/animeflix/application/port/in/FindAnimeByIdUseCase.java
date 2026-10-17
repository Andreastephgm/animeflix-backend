package com.animeflix.animeflix.application.port.in;

import com.animeflix.animeflix.domain.Anime;

import java.util.List;
import java.util.Optional;

public interface FindAnimeByIdUseCase {
    Optional<Anime> findById(String id);
}
