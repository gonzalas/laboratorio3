package ej.movie;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Movie {
    private UUID id;
    private String name;
    private int releaseYear;
    private int duration;
    private String audienceRating;
    private String country;
    private String description;
    private int copies;

    public Movie(String name, int releaseYear, int duration, String audienceRating, String country, String description, int copies){
        this.id = UUID.randomUUID();
        this.name = name;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.audienceRating = audienceRating;
        this.country = country;
        this.description = description;
        this.copies = copies;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseYear;
    }

    public void setReleaseDate(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAudienceRating() {
        return audienceRating;
    }

    public void setAudienceRating(String audienceRating) {
        this.audienceRating = audienceRating;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString(){
        return "\nPelícula: " + this.getName() +
                "\nId: " + this.getId() +
                "\nAño: " + this.getReleaseDate() +
                "\nDuración: " + this.getDuration() + " minutos" +
                "\nRating: " + this.getAudienceRating() +
                "\nPaís: " + this.getCountry() +
                "\nDescripción: " + this.getDescription() +
                "\nCopias: " + this.getCopies() +
                "\n--------------------------------------------------";
    }
}
