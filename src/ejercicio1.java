


/*
Programa java que realice lo siguiente: declarar una variable N de tipo int, una
variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la
diferencia de A - N, el valor numérico correspondiente al carácter que contiene la
variable C.

 */


public class ejercicio1 {

    public static void main (String[]args){
        int N = 10;
        double A = 10.55;
        char C = 'c';

        System.out.println("El valor de N es: " + N);
        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de C es: " + C);
        System.out.println("La suma de N + A es: " + (N + A));
        System.out.println("La diferencia de A - N es: " + (A - N));
        System.out.println("El valor numérico del caracter " + C + " es: " + (int)C);

    }
}
