package ejercicio2;

/*
Vamos a diseñar un programa que nos permita gestionar el personal que concurre
a un colegio. Para no hacerlo muy extenso vamos a limitarnos a estudiantes y
miembros de staff que a diferencia de los estudiantes, estos perciben una
remuneración. Ambos tipos comparten la característica de Persona que posee los
atributos de dni, nombre, apellido, email y direccion.
Por otro lado tenemos al Estudiante que posee las características de
Persona y las de un estudiante, que en este caso son, año de ingreso, cuota
mensual y carrera.
Y finalmente tenemos al miembro de Staff que también es una Persona pero
con características propias de alguien que trabaja para una institución, por ejemplo
salario y turno, este puede ser mañana o noche.
Diagramar el UML identificando superclase y subclases, crear constructores
necesarios, getters y setters, métodos de ayuda como salario anual y toString para
facilitar la impresión.
● Inicializar 4 estudiantes diferentes.
● Inicializar 4 miembros de staff con características diferentes.
● Crear un array que permita almacenar juntos los tipos anteriores y
almacenar las 8 instancias creadas anteriormente.
● Investigar el uso de la palabra reservada instanceof.
● Recorrer el array y mostrar por pantalla la cantidad de estudiantes y
la cantidad de miembros de staff.
● Recorrer el array y sumar el total de ingresos que percibe la
institución por parte de la cuota de estudiantes.

 */

public class Main {

    public static void main(String[]args){

        //Initializing 4 different students
        Student student1 = new Student(40123456, "Pepe", "Grillo", "pgrillo@email.com", "Casa 1234", "Programación", 2019, 2000);
        Student student2 = new Student(39666555, "María", "Elena", "maria@email.com", "Casa 4568", "Arquitectura", 2016, 3500);
        Student student3 = new Student(41258963, "Juan", "Sanchez", "jsan@email.com", "Casa 9632", "Programación", 2018, 2000);
        Student student4 = new Student(42568978, "Carlos", "Lopez", "carpez@email.com", "Casa 1111", "Ingeniería Naval", 2020, 3200);

        //Initializing 4 different staff
        Staff staff1 = new Staff(30568977, "Lionel", "Messina", "liogol@email.com", "Casa 3366", 30000, "Noche");
        Staff staff2 = new Staff(28963214, "Mario", "Amador", "marito@email.com", "Casa 1222", 275000, "Mañana");
        Staff staff3 = new Staff(35698712, "Susana", "Muro", "sumuro@email.com", "Casa 7788", 40000, "Noche");
        Staff staff4 = new Staff(34589632, "Cecilio", "Rodriguez", "rodri@email.com", "Casa 9111", 45200, "Mañana");

        //Creating array
        Object[] people = new Object[8];

        //Saving instances
        people[0] = student1;
        people[1] = student2;
        people[2] = student3;
        people[3] = student4;
        people[4] = staff1;
        people[5] = staff2;
        people[6] = staff3;
        people[7] = staff4;

        //Display array
        for(Object person : people){
            System.out.println(person);
        }

        //Count students and staff
        int amountStudents = 0;
        int amountStaff = 0;
        float totalFee = 0;

        for(Object person: people){
            if(person instanceof Student){
                amountStudents++;
                totalFee += ((Student) person).getFeeMonthly();
            } else {
                amountStaff++;
            }
        }

        System.out.println("Total de Estudiantes: " + amountStudents);
        System.out.println("Total de Staff: " + amountStaff);;
        System.out.println("Ingresos de la Institución mensual por cuotas: $" + totalFee);




    }
}
