package com.animeflix.animeflix.infrastructure.persistence.repository;

import com.animeflix.animeflix.infrastructure.persistence.documents.AnimeDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeSpringRepository extends MongoRepository<AnimeDocument, String> {

}
