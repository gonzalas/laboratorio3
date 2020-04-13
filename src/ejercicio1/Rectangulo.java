package ejercicio1;

/*
Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor
1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También
debe contar con un método para calcular el área y perímetro del mismo. Ejecute las
siguientes pruebas:
a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
b. Imprimir por pantalla el alto y ancho.
c. Imprimir por pantalla el área y perímetro.
d. Modificar el alto y el ancho de la instancia.
e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.

 */

public class Rectangulo {

    private double ancho = 1.0;
    private double alto = 1.0;

    public Rectangulo(){
    }

    public Rectangulo (double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularPerimetro(){
        return (this.alto*2) + (this.ancho*2);
    }

    public void imprimirPerimetro(){
        System.out.println("El perímetro del rectángulo es de " + ((this.getAlto()*2) + (this.getAncho()*2)));
    }

    public double calcularArea(){
        return this.alto * this.ancho;
    }

    public void imprimirArea(){
        System.out.println("El área del rectángulo es de " + (this.getAlto() * this.getAncho()));
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }


    //Clase main para testear mi clase Rectángulo
    public static void main(String[]args){

        Rectangulo rectangulo = new Rectangulo(10.3, 8.8);

        System.out.println("El alto de mi rectángulo es: " + rectangulo.getAlto() + " y el ancho es: " + rectangulo.getAncho());
        rectangulo.imprimirArea();
        rectangulo.imprimirPerimetro();

        rectangulo.setAlto(5);
        rectangulo.setAncho(8);

        System.out.println("Nuevo alto: " + rectangulo.getAlto() + " - Nuevo ancho: " + rectangulo.getAncho());
        rectangulo.imprimirPerimetro();
        rectangulo.imprimirArea();

        Rectangulo nuevo_rectangulo = new Rectangulo();
        System.out.println("Nuevo rectángulo con valores por defecto. Alto: " + nuevo_rectangulo.getAlto() + " .Ancho: " + nuevo_rectangulo.getAncho());
    }
}

