package ej.service;

import ej.client.Client;
import ej.movie.*;
import ej.rent.Rent;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Service {
    private List<ActionMovie> actionMovies;
    private List<AdventureMovie> adventureMovies;
    private List<ComedyMovie> comedyMovies;
    private List<DocumentalMovie> documentalMovies;
    private List<DramaMovie> dramaMovies;
    private List<HorrorMovie> horrorMovies;
    private List<Client>clients;
    private List<Rent> rents;
    private LocalDate rentDate;
    final int daysRent = 10;

    public Service(List<ActionMovie> actionMovies, List<AdventureMovie> adventureMovies, List<ComedyMovie> comedyMovies, List<DocumentalMovie> documentalMovies, List<DramaMovie> dramaMovies, List<HorrorMovie> horrorMovies, List<Client>clients) {
        this.actionMovies = actionMovies;
        this.adventureMovies = adventureMovies;
        this.comedyMovies = comedyMovies;
        this.documentalMovies = documentalMovies;
        this.dramaMovies = dramaMovies;
        this.horrorMovies = horrorMovies;
        this.clients = clients;
        this.rents = new ArrayList<>();
        this.rentDate = null;
    }

    public Movie checkMovie(String movieTitle){
        Movie returnMovie = null;

        if(returnMovie == null){
            for(ActionMovie m : actionMovies){
                if(m.getName().equals(movieTitle)){
                    returnMovie = m;
                }
            }
        }

        if(returnMovie == null){
            for(AdventureMovie m : adventureMovies){
                if(m.getName().equals(movieTitle)){
                    returnMovie = m;
                }
            }
        }

        if(returnMovie == null){
            for(ComedyMovie m : comedyMovies){
                if(m.getName().equals(movieTitle)){
                    returnMovie = m;
                }
            }
        }

        if(returnMovie == null){
            for(DocumentalMovie m : documentalMovies){
                if(m.getName().equals(movieTitle)){
                    returnMovie = m;
                }
            }
        }

        if(returnMovie == null){
            for(DramaMovie m : dramaMovies){
                if(m.getName().equals(movieTitle)){
                    returnMovie = m;
                }
            }
        }

        if(returnMovie == null){
            for(HorrorMovie m : horrorMovies){
                if(m.getName().equals(movieTitle)){
                    returnMovie = m;
                }
            }
        }

        return returnMovie;
    }

    public Client checkClient(String clientName){
        Client returnClient = null;
        Client client = null;

        //First, verify name
        for(Client c : clients){
            if(c.getName().equals(clientName)){
                client = c;
            }
        }

        //Then, verify same ID
        if(client != null){
            for(Client c : clients){
                if(c.getId().equals(client.getId())){
                    returnClient = client;
                }
            }
        }

        return returnClient;
    }


    public Client generateClient(){
        String name, phone, address;

        Scanner scan = new Scanner(System.in);

        System.out.println("- Crear cliente -");
        System.out.println("Ingrese nombre: ");
        name = scan.nextLine();
        System.out.println("Ingrese teléfono: ");
        phone = scan.nextLine();
        System.out.println("Ingrese dirección: ");
        address = scan.nextLine();

        Client c = new Client(name, phone, address);

        //Adding to collection
        clients.add(c);

        return c;
    }

    public void setRentDate(){
        this.rentDate = LocalDate.now();
    }

    public LocalDate getRentDate(){
        return this.rentDate;
    }

    public String generateTicket(Client client, Movie movie){
        setRentDate();
        return "Cliente: " + client.getName() +
                "\nPelícula: " + movie.getName() +
                "\nFecha de alquiler: " + this.getRentDate() +
                "\nFecha de entrega: " + this.getRentDate().plusDays(daysRent) +
                "\n-------------------------------------------------------------";
    }

    public void rentMovie(Movie m){
        int copies = m.getCopies();
        m.setCopies(--copies);
    }

    public void saveRent(Rent r){
        this.rents.add(r);
    }

    public void updateRentMoviesCopies(Movie m){
        int copies = m.getCopies();
        copies++;
        m.setCopies(copies);
    }

    public void showRent(){
        for(Rent r : rents){
            System.out.println(r);
        }
        System.out.println("Alquileres totales: " + rents.size());
    }

    public void showRentDeliverToday(){
        System.out.println("Alquileres que vencen hoy: ");

        for(Rent r : rents){
            if(r.getDeliverDay().equals(LocalDate.now())){
                System.out.println(r);
            }
        }
        System.out.println("Alquileres totales: " + rents.size());
    }

    public void showRentsForClients(Client c){
        int rentMovies = 0;

        System.out.println("Últimos diez alquileres de " + c.getName());
        for(Rent r : rents){
            if(r.getClient().getName().equals(c.getName()) && rentMovies < 10){
                System.out.println(r);
                rentMovies++;
            }
        }
    }

    public void showRentedMovies() {
        Stream.of(this.rents)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .ifPresent(System.out::println);
    }

    public void showMovieDetail(Movie m){
        System.out.println(m);
    }

    public void moviesByGender(String gender){
        switch(gender){
            case "Action": {
                for(ActionMovie m : this.actionMovies){
                    System.out.println(m);
                }
                break;
            }
            case "Adventure": {
                for(AdventureMovie m : this.adventureMovies){
                    System.out.println(m);
                }
                break;
            }
            case "Comedy": {
                for(ComedyMovie m : this.comedyMovies){
                    System.out.println(m);
                }
                break;
            }
            case "Documental": {
                for(DocumentalMovie m : this.documentalMovies){
                    System.out.println(m);
                }
                break;
            }
            case "Drama": {
                for(DramaMovie m : this.dramaMovies){
                    System.out.println(m);
                }
                break;
            }
            case "Horror": {
                for(HorrorMovie m : this.horrorMovies){
                    System.out.println(m);
                }
                break;
            }
            default: {
                System.out.println("Género no encontrado.");
            }
        }
    }
}
