package com.animeflix.animeflix.repository;

import com.animeflix.animeflix.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISerieRepository extends JpaRepository<Serie, Long> {
}
