package ej;

/*
Nos contactan para realizar un software que le permita a un video store gestionar los
alquileres de sus películas. Nuestro cliente, Roberto, nos cuenta que su negocio dispone de
un amplio catálogo de películas, de los siguientes géneros. Acción, Aventura, Comedia,
Drama, Horror y Documental. Cada film de su inventario cuenta con un título, una fecha de
lanzamiento, una duración en minutos, una clasificación de audiencia, las siglas del país de
origen y una descripción de la misma. El video store de Roberto, ofrece la posibilidad de
alquilar los títulos físicamente, esto significa que hay un límite fijo de copias de cada título.
Por otro lado, nuestro cliente nos cuenta que le interesa saber acerca de quienes alquilan
sus películas, su nombre, teléfono y dirección.

Roberto además nos cuenta como es el proceso de alquiler de un título de su colección, el
cliente se acerca, solicita una película, Roberto corrobora que exista en su colección si
existe, se asegura que tenga una copia disponible. Por último le pide los datos a su cliente,
si ya existe, procede a generar una boleta de préstamo definiendo la fecha de retiro y la
fecha de devolución. Caso contrario, primero carga los datos del nuevo cliente y continúa
con la reserva. Una vez que el tiempo de préstamo finaliza y el cliente se acerca a devolver
el título, Roberto, anota la devolución y guarda el título para tenerlo listo para el próximo
alquiler.

Roberto nos cuenta que le gustaría contar con ciertas funcionalidades que le harían el
trabajo del dia a dia más fácil, tomamos nota de las mismas:
● Quiere una forma de poder consultar los alquileres vigentes.
● Quiere una forma de poder consultar las devoluciones que deberían hacerse en el
dia de la fecha.
● Quiere poder consultar los últimos 10 alquileres de cada cliente.
● Quiere una forma de consultar los títulos que fueron más alquilados.
● También quiere poder buscar títulos por género y ordenarlos según popularidad.
● Quiere poder ver información detallada de un determinado título.

Clasificación de audiencia:
● G (Apta para todos los públicos)
● PG (Sugiere la compañía de un adulto para los menores de 10 años)
● PG-13 (Sugiere la compañía de un adulto para los menores de 13 años)
● R (Restringido a menores de 17 años si no es con la compañía de un adulto)
● NC-17 (Contenido sólo para mayores de 18 años)
● UNRATED (Películas que no han pasado el proceso de calificación)
Como empezar con la guia:
Analizar los objetos para definir el diagrama de clases, identificando atributos, métodos y
constructores necesarios. Una vez diagramado el sistema, escribir el código y realizar las
pruebas necesarias.
 */


import ej.client.Client;
import ej.movie.*;
import ej.rent.Rent;
import ej.service.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        //Simulate database, generate movies

        ActionMovie deadpool = new ActionMovie("Deadpool", 2016, 109, "PG-13", "USA", "", 10);
        ActionMovie xMen = new ActionMovie("X-Men", 2000, 104, "PG-13", "USA", "", 3);
        ActionMovie logan = new ActionMovie("Logan", 2017, 137, "R", "USA", "", 5);

        AdventureMovie tarzan = new AdventureMovie("La leyenda de Tarzán", 2016, 111, "PG-13", "USA", "", 2);
        AdventureMovie baywatch = new AdventureMovie("Baywatch", 2017, 117, "PG-13", "USA", "", 4);
        AdventureMovie jumanji = new AdventureMovie("Jumanji: el siguiente nivel", 2019, 122, "PG-13", "USA", "", 3);

        ComedyMovie metegol = new ComedyMovie("Metegol", 2013, 107, "G", "ARG", "Animada", 2);
        ComedyMovie tontoRetonto = new ComedyMovie("Tonto y Retonto", 1994, 107, "G", "USA", "", 5);

        DocumentalMovie senna = new DocumentalMovie("Senna", 2010, 106, "G", "UK", "", 1);

        DramaMovie hombresHonor = new DramaMovie("Hombres de Honor", 2000, 129, "R", "USA", "", 3);
        DramaMovie coachCarter = new DramaMovie("Juego de Honor", 2005, 136, "PG-13", "USA", "", 2);

        HorrorMovie scream = new HorrorMovie("Scream", 1996, 111, "R", "USA", "", 2);
        HorrorMovie it = new HorrorMovie("IT", 2017, 135, "R", "USA", "", 5);

        //Creating collections
        List<ActionMovie> actionMovies = new ArrayList<>();
        actionMovies.add(deadpool);
        actionMovies.add(xMen);
        actionMovies.add(logan);

        List<AdventureMovie> adventureMovies = new ArrayList<>();
        adventureMovies.add(tarzan);
        adventureMovies.add(baywatch);
        adventureMovies.add(jumanji);

        List<ComedyMovie> comedyMovies = new ArrayList<>();
        comedyMovies.add(metegol);
        comedyMovies.add(tontoRetonto);

        List<DocumentalMovie> documentalMovies = new ArrayList<>();
        documentalMovies.add(senna);

        List<DramaMovie> dramaMovies = new ArrayList<>();
        dramaMovies.add(hombresHonor);
        dramaMovies.add(coachCarter);

        List<HorrorMovie> horrorMovies = new ArrayList<>();
        horrorMovies.add(scream);
        horrorMovies.add(it);


        //Generate some clients

        Client client1 = new Client("Carlos Lopez", "1147896321", "Casa 1123");
        Client client2 = new Client("Sandra Perez", "1169873211", "Casa 9988");
        Client client3 = new Client("Pepe Grillo", "1156985698", "Casa 36");

        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);


        //Renting movies
       rentingSystem(actionMovies, adventureMovies, comedyMovies, documentalMovies, dramaMovies, horrorMovies, clients);

    }

    public static void rentingSystem(List<ActionMovie> actionMovies, List<AdventureMovie> adventureMovies, List<ComedyMovie> comedyMovies, List<DocumentalMovie> documentalMovies, List<DramaMovie> dramaMovies, List<HorrorMovie> horrorMovies, List<Client>clients){

        Scanner scan = new Scanner(System.in);

        //Generating service
        Service service = new Service(actionMovies, adventureMovies, comedyMovies, documentalMovies, dramaMovies, horrorMovies, clients);

        Movie m = null;
        String titleMovie = "";
        System.out.println("Ingrese película: ");
        titleMovie = scan.nextLine();
        m = service.checkMovie(titleMovie);

        while(m == null){
            System.out.println("No se encontró película. Ingrese nuevamente: ");
            titleMovie = scan.nextLine();
            m = service.checkMovie(titleMovie);
        }

        if(m.getCopies() < 1){
            System.out.println("La película " + m.getName() + " no está disponible. No hay copias para alquilar.");
        } else {
            System.out.println("La película está disponible.");
            System.out.println("Ingrese nombre del cliente para buscar en la base de datos: ");
            String clientName = scan.nextLine();
            Client c = service.checkClient(clientName);

            if(c == null){
                System.out.println("El cliente no está registrado:");
                c = service.generateClient();
            }

            //Saving Rent
            Rent rent = new Rent(c, m, LocalDate.now());
            service.rentMovie(m);
            service.saveRent(rent);

            //Extracting one copy of the movie
            int copiesMovie = m.getCopies();
            copiesMovie--;
            m.setCopies(copiesMovie);

            //Printing ticket
            System.out.println("- Ticket -");
            System.out.println(service.generateTicket(c, m));

            //Check amount of movies rented
            service.showRentedMovies();

            //Show all rents
            service.showRent();

            //Update movies stock once delivered
            service.updateRentMoviesCopies(m);

            //Show rent delivered today
            service.showRentDeliverToday();

            //Show last 10 rents of a client
            service.showRentsForClients(c);

            //Show details of a movie
            service.showMovieDetail(m);

            //Search movies by gender
            service.moviesByGender("Comedy");
        }

    }
}


