package com.animeflix.animeflix.domain;

public class Episode {

    private int episodeNumber;
    private String title;
    private String videoUrl;
    private String duration;

    public Episode(int episodeNumber, String title, String videoUrl, String duration) {
        this.episodeNumber = episodeNumber;
        this.title = title;
        this.videoUrl = videoUrl;
        this.duration = duration;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
