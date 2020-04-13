package ejercicio4;

/*
Modele el objeto que representa la cuenta de un banco, con identificador, nombre
y balance. Considere los getters, setters y constructores necesarios. Tenga en
cuenta los siguientes métodos.
a. El método crédito que representa un depósito de dinero en la cuenta. Este
método debe devolver el balance luego de la operación.
b. El método débito que representa una sustracción de dinero de la cuenta.
Este método debe devolver el balance luego de la operación. Si el dinero en
la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
pantalla un aviso.
c. Un método que imprima por pantalla las características del objeto.
Realice las siguientes operaciones:
1. Inicialice una cuenta con un monto inicial de 15000.
2. Realice una operación de crédito de 2500.
3. Realice una operación de compra de 1500.
4. Realice una operación de compra de 30000.
5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea
correcto.
 */

public class CuentaBancaria {
    private int id;
    private String nombre;
    private double balance;

    public CuentaBancaria (int id, String nombre, double balance){
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public double credito(double deposito){
        this.balance += deposito;
        return this.balance;
    }

    public double debito(double sustraccion){
        double nuevoBalance = this.balance - sustraccion;
        if(nuevoBalance < 0){
            System.out.println("Usted no dispone de ese dinero para sustraer. Ingrese un saldo menor.");
            nuevoBalance = this.balance;
        } else {
            this.balance -= sustraccion;
        }
        return nuevoBalance;
    }

    public void imprimirDatosCuenta(){
        System.out.println("Cuenta bancaria[id= " + this.id + ", nombre= " + this.nombre + ", balance= " + this.balance + "]");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Clase Main
    public static void main(String[]args){
        CuentaBancaria cuenta1 = new CuentaBancaria(1, "Carlos Gomez", 15000);

        //Mostrar cuenta
        cuenta1.imprimirDatosCuenta();

        //Operación de crédito de 1500 y mostrar datos
        System.out.println("Crédito de 2500");
        cuenta1.credito(2500);
        cuenta1.imprimirDatosCuenta();

        //Operación de débito de 1500 y mostrar datos
        System.out.println("Débito de 1500");
        cuenta1.debito(1500);
        cuenta1.imprimirDatosCuenta();

        //Operación de débito de 30000 y mostrar datos
        System.out.println("Débito de 30000");
        cuenta1.debito(30000);
        cuenta1.imprimirDatosCuenta();

    }
}
