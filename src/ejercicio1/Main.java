package ejercicio1;

/*
Para comenzar esta guía, vamos a empezar con un ejemplo sencillo, que nos
permita entender el concepto de herencia, superclase y subclase. Para esto vamos a
definir el tipo Círculo, que posee un radio cuyo valor por defecto al ser inicializado
sin valores es 1.0. Además el tipo Círculo posee un atributo color, por defecto rojo,
un método para calcular el área y otro para imprimir sus características. Puede
reutilizar la clase Circulo de las guías anteriores.
Por otro lado tenemos un tipo Cilindro, que extiende a la clase Circulo, por
ende se convierte en subclase de Círculo. El Cilindro a diferencia del Círculo posee
un atributo altura, que también se inicializa en 1.0 cuando no le pasamos un valor a
su constructor. Y un método para calcular el volumen. Codifique ambas clases y
realice las siguientes pruebas.
● Inicializar un Cilindro y debuguear analizando los constructores a los que va
llamando para inicializar la cadena de herencia. Imprimir por pantalla, el
radio del cilindro, la altura, el área de la base y el volumen.
● Inicializar un segundo CIlindro esta vez especificando la altura y radio.
Imprimir por pantalla el radio, la altura, el área de la base y el volumen.
● Sobreescribir el método calcular area declarado en Círculo, para que nos
permita calcular el área del cilindro.
(2π×radius×height + 2×areaBase)
Imprimir por pantalla el área y el volumen del cilindro. Vamos a notar que el
cálculo del volumen difiere, esto es porque nosotros sobreescribimos el método
calcular area y ahora nos calcula el área de un cilindro. Modificar el método calcular
volumen en la clase cilindro para que llame al método de la SUPERclase que calcula
el área.
● Modificar el método toString() de la clase cilindro para que imprima por
pantalla lo siguiente
Cilindro: subclase de + {toString() de Círculo} +altura= {alturaCilindro};
 */

public class Main {

    public static void main(String[]args){

        //Testing classes
        Circle c = new Circle();
        System.out.println(c);

        Cylinder cy2 = new Cylinder();
        System.out.println(cy2);

        Cylinder cy = new Cylinder(5, 10, "blue");
        System.out.println(cy);        
        System.out.println("Area cylinder: " + cy.getArea());
        System.out.println("Volume cylinder: " + cy.getVolume());
    }
}
