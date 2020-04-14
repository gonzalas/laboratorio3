package ejercicio3;

/*
Necesitamos crear un programa que nos permita crear diferentes tipos de figuras
que poseen un color, estas figuras pueden o no estar coloreadas. Además
necesitamos que las figuras tengan la posibilidad de calcular area y perimetro. Por
el momento nos piden crear 2 Figuras, Círculo y Rectángulo. ambos deben contar
con sus respectivas características, ya sea radio, alto, largo, etc. Y deben contar con
los métodos de cálculo de area y perimetro implementados.
● Considerar si existe la posibilidad de crear un tipo abstracto que
defina las características en común y que permita establecer qué
métodos son mandatarios para las subclases.
● Los tipos deben contener diferentes constructores, por defecto y que
inicialice diferentes atributos.
● Crear diferentes instancias de cada tipo e imprimir sus
características.
● Nos piden agregar un nuevo tipo de forma, esta vez es un Cuadrado.
Analice dónde es conveniente agregarlo en el árbol de herencia.
Teniendo en cuenta evitar la duplicación de código innecesario.
 */

public class MainClass {

    public static void main(String[]args){

        //Creating different instances
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10, "Red");

        Circle c1 = new Circle();
        Circle c2 = new Circle(10, "Blue");

        //Showing instances
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(c1);
        System.out.println(c2);

        //Creating square
        Square s1 = new Square();
        Square s2 = new Square(5, "Black");

        //Showing squares
        System.out.println(s1);
        System.out.println(s2);


    }
}
