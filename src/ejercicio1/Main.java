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

public class Main {

    public static void main(String[]args){

        Autor autor = new Autor ("Joshua", "Bloch", "joshua@email.com", 'M');

        //Imprimir datos autor
        System.out.println("Datos autor:");
        autor.imprimirAutor();

        Libro libro = new Libro("Effective Java", 450, 150, autor);

        //Imprimir datos libro
        System.out.println("Datos libro:");
        libro.imprimirLibro();

        //Cambiar precio del libro a 500 y aumentar el stock en 50
        libro.setPrecio(500);
        libro.aumentarStock(50);

        //Mostrar datos autor desde clase Libro
        System.out.println("Mostrar datos autor desde clase Libro:");
        libro.mostrarDatosAutor();

        //Mostrar mensaje sobre el libro
        System.out.println("Mensaje sobre el libro");
        libro.mensajeLibro();

    }
}
