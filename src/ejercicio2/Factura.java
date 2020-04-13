package ejercicio2;


import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Factura {
    private UUID id;
    private float montoTotal;
    private LocalDate fecha;
    private Cliente cliente;
    private List<ItemVenta> items;

    public Factura(Cliente cliente, List<ItemVenta> items){
        this.id = UUID.randomUUID();
        this.fecha = LocalDate.now();
        this.cliente = cliente;
        this.items = items;
    }

    public void generarMontoTotal(){
        float monto = calcularMontoTotal();
        setMontoTotal(monto);
    }

    public float calcularMontoTotal(){
        float total = 0;

        for(ItemVenta item : items){
            total += item.getPrecioUnitario();
        }

        return total;
    }

    public float aplicarDescuento(float descuento){
        return this.montoTotal -= this.montoTotal * (descuento/100);
    }

    public void imprimirFactura(){
        System.out.println("Factura[id= " + this.id + ", fecha= " + this.fecha + ", monto= " + this.montoTotal + ", montoDescuento= " + aplicarDescuento(this.cliente.getDescuento()) + ", Cliente[id= " + this.cliente.getId() + ", nombre= " + this.cliente.getNombre() + ", email= " + this.cliente.getEmail() + ", descuento= " + this.cliente.getDescuento() + "] ]");
    }

    public void imprimirFacturaSinDesc(){
        System.out.println("Factura[id = " + this.id + ", fecha= " + this.fecha + ", montoSinDesc= " + this.montoTotal + ", Cliente: " + this.cliente.getNombre() + "]");
    }

    public void imprimirFacturaConDesc(){
        System.out.println("Factura[id = " + this.id + ", fecha= " + this.fecha + ", montoConDesc= " + aplicarDescuento(this.cliente.getDescuento()) + ", Cliente: " + this.cliente.getNombre() + "]");
    }

    public UUID getId() {
        return id;
    }


    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
