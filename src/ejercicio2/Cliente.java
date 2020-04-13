package ejercicio2;

import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private String email;
    private float descuento;

    public Cliente (String nombre, String email, float descuento){
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public void imprimirDatosCliente(){
        System.out.println("Empleado[id= " + this.id + ", nombre= " + this.nombre + ", email= " + this.email + ", descuento= " + this.descuento + "]");
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
}
