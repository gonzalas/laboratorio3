package ejercicio1;

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor(String nombre, String apellido, String email, char genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    public void imprimirAutor(){
        System.out.println("Autor: " +  this.nombre + " " + this.apellido + " - " + this.email);
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getEmail(){
        return this.email;
    }
}
