package com.animeflix.animeflix.application.port.out;

import com.animeflix.animeflix.domain.Anime;

import java.util.List;


public interface AnimeFindAllRepositoryPort {
    List<Anime> findAll();
}