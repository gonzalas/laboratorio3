package ej.rent;

import ej.client.Client;
import ej.movie.Movie;

import java.time.LocalDate;

public class Rent {
    private Client client;
    private Movie movie;
    private LocalDate rentDay;
    private LocalDate deliverDay;
    final int rentDays = 10;

    public Rent(Client c, Movie m, LocalDate rentDay){
        this.client = c;
        this.movie = m;
        this.rentDay = rentDay;
        this.deliverDay = this.rentDay.plusDays(rentDays);
    }

    @Override
    public String toString(){
        return "- Alquiler - " +
                "\nCliente: " + this.client.getName() +
                "\nPelícula: " + this.movie.getName() +
                "\nFecha de alquiler: " + this.rentDay +
                "\nFecha de entrega: " + this.deliverDay +
                "\n----------------------------------------------";
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalDate getRentDay() {
        return rentDay;
    }

    public void setRentDay(LocalDate rentDay) {
        this.rentDay = rentDay;
    }

    public LocalDate getDeliverDay() {
        return deliverDay;
    }

    public void setDeliverDay(LocalDate deliverDay) {
        this.deliverDay = deliverDay;
    }
}
