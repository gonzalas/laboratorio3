package ej.movie;


public class ActionMovie extends Movie{
    private String gender;

    public ActionMovie(String name, int releaseDate, int duration, String audienceRating, String country, String description, int copies) {
        super(name, releaseDate, duration, audienceRating, country, description, copies);
        this.gender = "Action";
    }

    public String getGender(){
        return this.gender;
    }

    @Override
    public String toString(){
        return "\nPelícula: " + this.getName() +
                "\nGénero: " + this.getGender() +
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
