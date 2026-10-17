package com.animeflix.animeflix.infrastructure.persistence.mappers;

import com.animeflix.animeflix.domain.Anime;
import com.animeflix.animeflix.infrastructure.persistence.documents.AnimeDocument;

public class AnimeMapper {

    public static Anime toDomain(AnimeDocument doc){
        if(doc == null)
            return null;

        return new Anime(
                doc.getId(),
                doc.getTitle(),
                doc.getSynopsis(),
                doc.getCoverImage(),
                doc.getGenres(),
                null
        );
    }

    public static AnimeDocument toDocument(Anime anime){
        if(anime == null)
            return null;

        AnimeDocument doc = new AnimeDocument();
        doc.setId(anime.getId());
        doc.setTitle(anime.getTitle());
        doc.setSynopsis(anime.getSynopsis());
        doc.setCoverImage(anime.getCoverImage());
        doc.setGenres(anime.getGenres());

        return doc;
    }
}
