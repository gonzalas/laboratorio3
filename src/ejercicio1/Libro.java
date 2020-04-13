package ejercicio1;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    public Libro (String titulo, double precio, int stock, Autor autor){
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public void imprimirLibro(){
        System.out.println("Libro: " + this.titulo + ". Precio: $" + this.precio + ". Stock: " + this.stock + " copias. Autor: " + this.autor.getNombre() + " " + this.autor.getApellido());
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

    public void mostrarDatosAutor(){
        System.out.println(this.autor.getNombre() + " " + this.autor.getApellido() + " - " + this.autor.getEmail());
    }

    public void mensajeLibro(){
        System.out.println("El libro " + this.titulo + " de " + this.autor.getNombre() + " " + this.autor.getApellido() + " se vende a " + this.precio + " pesos.");
    }
}
