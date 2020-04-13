package ejercicio2;

/*
 Modele el objeto Empleado que posee las siguientes características, dni, nombre,
apellido y salario. El mismo debe contar con la posibilidad de calcular el salario
anual. A su vez se requiere otro método que permita aumentar el salario
dependiendo del porcentaje que se le pase por parámetro. Considere crear un
método que facilite imprimir por pantalla las características del objeto de la
siguiente forma:
Empleado[dni=?, nombre=?, apellido=?, salario=?]
a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
25000.
b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
27500.
c. Imprima ambos objetos por pantalla
d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
salario anual del mismo.

 */

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(int dni, String nombre, String apellido, double salario){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public double calcularSalarioAnual(){
        return this.salario * 12;
    }

    public void aumentarSalario(float aumento){
        this.salario += this.salario * (aumento/100);
    }

    public void imprimirEmpleado(){
        System.out.println("Empleado[dni= " + this.dni + ", nombre= " + this.nombre + ", apellido= " + this.apellido + ", salario= " + this.salario + "]");
    }


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Clase main para Testear
    public static void main(String[]args){
        Empleado e1 = new Empleado(23456345, "Carlos", "Rodriguez", 25000);
        Empleado e2 = new Empleado(34234123, "Ana", "Sanchez", 27500);

        //Mostrar ficha de empleados
        e1.imprimirEmpleado();
        e2.imprimirEmpleado();

        //Aumentar a Carlos 15% salario y mostrar salario anual
        System.out.println("El salario anual sin aumento de Carlos es " + e1.calcularSalarioAnual());
        e1.aumentarSalario(15);
        System.out.println("El salario anual con aumento de Carlos es " + e1.calcularSalarioAnual());
    }
}
