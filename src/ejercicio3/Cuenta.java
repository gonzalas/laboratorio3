package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cuenta {
    private UUID id;
    private double balance;
    private double saldoDeudor;
    private Cliente cliente;
    private List<String> registros;

    public Cuenta(Cliente cliente, double balance){
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.saldoDeudor = 0;
        this.cliente = cliente;
        this.registros = new ArrayList<String>();
    }

    public void depositar(double deposito){
        this.balance += deposito;
        String registro = "El cliente " + this.cliente.getNombre() + " depositó " + deposito + ".";
        agregarRegistro(registro);
    }

    public void extraer(double extraccion){
        if(extraccion > (this.balance + 2000)){
            System.out.println("No se puede realizar la operación ya que no tiene ese saldo en su cuenta.");
        } else if ((this.balance - extraccion) > -2000 && (this.balance - extraccion < 0)){
            double sueldo = this.balance;
            this.balance = 0;
            this.saldoDeudor = sueldo - extraccion;
        } else {
            this.balance -= extraccion;
        }

        String registro = "El cliente " + this.cliente.getNombre() + " extrajo " + extraccion + ".";
        agregarRegistro(registro);
    }

    public double mostrarDeuda(){
        double deuda = 0;
        return deuda + this.saldoDeudor;
    }

    public void imprimirDatosCuenta(){
        System.out.println("Cuenta[id= " + this.id + ", cliente: " + this.cliente.getNombre() + ", saldo: " + this.balance + ", saldoDeudor: " + mostrarDeuda() + "]");
    }

    public void agregarRegistro(String registro){
        this.registros.add(registro);
    }

    public void mostrarRegistros(){
        for(String registro : this.registros){
            System.out.println(registro);
        }
    }
}
