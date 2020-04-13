package ejercicio1;

import java.util.List;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private List<Autor> autores;

    public Libro (String titulo, double precio, int stock, List<Autor> autores){
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autores = autores;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public void aumentarStock(double stock){
        this.stock += stock;
    }

    public String listarAutores(){
        String listadoAutores = "";
        for(Autor autor : autores){
            listadoAutores += autor.getNombreApellidoAutor() + ", ";
        }
        return listadoAutores;
    }
    public void mensajeLibro(){
        System.out.println("El libro " + this.titulo + " de " + listarAutores() + " se vende a " + this.precio + " pesos.");
    }
}
