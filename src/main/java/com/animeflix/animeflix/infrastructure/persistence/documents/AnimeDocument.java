package com.animeflix.animeflix.infrastructure.persistence.documents;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "animes")
public class AnimeDocument {
    @Id
    private String id;
    private String title;
    private String synopsis;
    private String coverImage;
    private List<String> genres;
    private List<EpisodeDocument> episodes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<EpisodeDocument> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<EpisodeDocument> episodes) {
        this.episodes = episodes;
    }
}
