package ejercicio3;

import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private char genero;

    public Cliente(String nombre, char genero){
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.genero = genero;
    }

    public void imprimirDatosCliente(){
        System.out.println("Cliente[id= " + this.id + ", nombre= " + this.nombre + ", género= " + this.genero + "]");
    }

    public String getNombre(){
        return this.nombre;
    }
}
