package com.animeflix.animeflix.application.port.out;

import com.animeflix.animeflix.domain.Anime;

import java.util.Optional;

public interface AnimeFindByIdRepositoryPort {
    Optional<Anime> findById(String id);
}
