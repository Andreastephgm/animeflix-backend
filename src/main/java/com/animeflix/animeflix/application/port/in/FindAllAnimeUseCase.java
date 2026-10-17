package com.animeflix.animeflix.application.port.in;

import com.animeflix.animeflix.domain.Anime;

import java.util.List;

public interface FindAllAnimeUseCase {
    List<Anime> findAll();
}
