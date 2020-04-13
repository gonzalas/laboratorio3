package ejercicio3;

/*
 Necesitamos crear un programa para manejar los datos de una Cuenta bancaria de
un Cliente. Para esto identificamos los atributos id, nombre y género (M o F) para el
Cliente. Por otro lado tenemos el tipo Cuenta que también posee un identificador,
un balance y un Cliente que es el dueño de la cuenta. La Cuenta debe exponer los
métodos depositar y extraer que modifican el balance de la misma. Algo a tener en
cuenta es que el método extraer no puede extraer dinero si el balance total no lo
permite, si esto sucede se debe imprimir un mensaje por pantalla que indique que
la cuenta no posee saldo suficiente.
a. Crear un Cliente e imprimirlo en pantalla.
b. Crear una Cuenta bancaria para el Cliente anterior con un saldo inicial de
10000.
c. Realizar operaciones de depósito y extracción para probar esa
funcionalidad.
d. Es necesario agregar una variante de Cuenta que permita un saldo deudor,
de máximo 2000 pesos. Esto significa que la cuenta puede aceptar un
balance negativo con un máximo de - 2000. Realice los cambios y pruebas
necesarias.
e. Analice cómo implementaría con las herramientas conocidas hasta el
momento, llevar un registro de como máximo 10 operaciones de depósito y
extracción que se realizaron en la cuenta. En donde se almacene en
memoria de alguna forma la siguiente cadena de texto:
i. Depósito: "El {NombreCliente}, depositó {MontoDepositado}"
ii. Extracción: "El {NombreCliente}, retiró {MontoRetirado}"
 */


public class Main {

    public static void main(String[]args){

        //Crear cliente
        Cliente cliente = new Cliente("Alberto Fernández", 'M');
        //Mostrar cliente
        System.out.println("Cliente");
        cliente.imprimirDatosCliente();

        //Crear cuenta con saldo 10000
        Cuenta cuenta = new Cuenta(cliente, 10000);
        cuenta.imprimirDatosCuenta();

        //Operaciones de extracción y depósito para probar funcionalidad
        System.out.println("Depositar 10000");
        cuenta.depositar(10000);
        cuenta.imprimirDatosCuenta();

        System.out.println("Extraer 30000");
        cuenta.extraer(30000);
        cuenta.imprimirDatosCuenta();

        System.out.println("Extraer 5000");
        cuenta.extraer(5000);
        cuenta.imprimirDatosCuenta();

        //Operaciones de prueba con saldo deudor
        Cliente otroCliente = new Cliente("Mauricio Macri", 'M');
        Cuenta otraCuenta = new Cuenta(otroCliente, 15000);

        System.out.println("Otra cuenta y pruebas con saldo deudor");
        otraCuenta.imprimirDatosCuenta();

        System.out.println("Extraer 16000");
        otraCuenta.extraer(16000);
        otraCuenta.imprimirDatosCuenta();

        //Crear registros en cuenta y mostrarlos
        otraCuenta.depositar(20000);
        otraCuenta.extraer(2000);
        otraCuenta.depositar(3000);
        otraCuenta.mostrarRegistros();

    }
        

}
