package com.animeflix.animeflix.infrastructure.persistence.adapters;

import com.animeflix.animeflix.application.port.out.*;
import com.animeflix.animeflix.domain.Anime;
import com.animeflix.animeflix.infrastructure.persistence.documents.AnimeDocument;
import com.animeflix.animeflix.infrastructure.persistence.mappers.AnimeMapper;
import com.animeflix.animeflix.infrastructure.persistence.repository.AnimeSpringRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class AnimeRepositoryAdapter implements AnimeFindAllRepositoryPort , AnimeSaveRepositoryPort ,AnimeFindByIdRepositoryPort, AnimeUpdateRepositoryPort, AnimeDeleteRepositoryPort {

    private final AnimeSpringRepository mongoRepository;

    public AnimeRepositoryAdapter(AnimeSpringRepository mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    @Override
    public List<Anime> findAll() {
        return mongoRepository.findAll().stream()
                .map(AnimeMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Anime save(Anime anime) {
        AnimeDocument document = AnimeMapper.toDocument(anime);
        AnimeDocument savedDocument = mongoRepository.save(document);
        return AnimeMapper.toDomain(savedDocument);
    }


    @Override
    public Optional<Anime> findById(String id) {
        return mongoRepository.findById(id).map(AnimeMapper::toDomain);
    }

    @Override
    public Optional<Anime> updateAnime(String id, Anime anime) {
        if (!mongoRepository.existsById(id)) {
            return Optional.empty();
        }
        anime.setId(id);

        AnimeDocument document = AnimeMapper.toDocument(anime);
        AnimeDocument updatedDocument = mongoRepository.save(document);
        return Optional.of(AnimeMapper.toDomain(updatedDocument));
    }

    @Override
    public void deleteById(String id) {
        mongoRepository.deleteById(id);
    }
}
