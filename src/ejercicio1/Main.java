package ejercicio1;

/*
Es necesario modelar el objeto de tipo Libro con las siguientes caracteristicas, titulo,
precio, stock y Autor, este último posee las características de nombre, apellido,
email y genero ( ‘M’ o ‘F’ ). Para este ejercicio vamos a asumir que un libro tiene un
único autor. Ejecute las siguientes instrucciones:
a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
b. Imprima por pantalla al autor previamente instanciado.
c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
pesos con una cantidad de 150 copias.
d. Imprima por pantalla el libro instanciado.
e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
cantidad en 50 copias.
f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
Libro “Effective Java”.
g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
siguiente mensaje:
“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
cambios necesarios en el método del punto g, para imprimir un nuevo
mensaje que liste los autores que contribuyeron a ese libro.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[]args){

        Autor autor1 = new Autor ("Joshua", "Bloch", "joshua@email.com", 'M');
        Autor autor2 = new Autor("Susan", "Jones", "susanjones@email.com", 'F');
        Autor autor3 = new Autor("Charles", "Darwin", "cd@email.com", 'M');

        List<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);
        autores.add(autor3);

        Libro libro = new Libro("Effective Java", 450, 150, autores);



        //Mostrar mensaje sobre el libro
        System.out.println("Mensaje sobre el libro");
        libro.mensajeLibro();

    }
}
