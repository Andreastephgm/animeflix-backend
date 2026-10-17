package com.animeflix.animeflix.domain;

import java.util.List;

public class Anime {

    private String id;
    private String title;
    private String synopsis;
    private String coverImage;
    private List<String> genres;
    private List<Episode> episodes;

    public Anime(String id, String title, String synopsis, String coverImage, List<String> genres, List<Episode> episodes) {
        this.id = id;
        this.title = title;
        this.synopsis = synopsis;
        this.coverImage = coverImage;
        this.genres = genres;
        this.episodes = episodes;
    }

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

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }
}
