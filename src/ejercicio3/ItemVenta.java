package ejercicio3;

/*
Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
total teniendo en cuenta el precio unitario y cantidad. Un método que permita
imprimir por pantalla los atributos del objeto de la siguiente forma:
ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
a. Inicialice el objeto con los atributos necesarios
b. Imprima por pantalla el objeto inicializado.
 */

public class ItemVenta {
    private int identificador;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public ItemVenta(int id, String descripcion, int cantidad, double precio){
        this.identificador = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precio;
    }

    public double calcularTotal(){
        return this.precioUnitario * this.cantidad;
    }

    public void imprimirItem(){
        System.out.println("ItemVenta[id = " + this.identificador + ", descripción= " + this.descripcion + ", cantidad= " + this.cantidad + ", pUnitario= " + this.precioUnitario + ", pTotal= " + this.calcularTotal() + "]");
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }


    //Testeo de clase
    public static void main(String[]args){
        ItemVenta item = new ItemVenta(1, "Caramelo", 10, 10.5);
        item.imprimirItem();
    }
}
