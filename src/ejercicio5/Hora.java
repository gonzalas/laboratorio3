package ejercicio5;

/*
Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
Tenga en cuenta el rango de valores aceptados para cada uno de estos.
a. Hora: 0 … 23
b. Minuto: 0 … 59
c. Segundo: 0 … 59
Considere el siguiente comportamiento:
1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
usando zero a la izquierda ejemplo 13:04:22 .
2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
4. Instanciar el objeto y probar los métodos creados.
 */

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora avanzarUnSegundo(){
        this.segundos += 1;
        if(this.segundos == 60){
            this.segundos = 0;
            this.minutos += 1;
            if(this.minutos == 60){
                this.minutos = 0;
                this.hora += 1;
                if(this.hora == 24){
                    this.hora = 0;
                }
            }
        }
        return this;
    }

    public Hora retrocederUnSegundo(){
        this.segundos -= 1;
        if(this.segundos == -1){
            this.segundos = 59;
            this.minutos =- 1;
            if(this.minutos == -1){
                this.minutos = 59;
                this.hora -= 1;
                if(this.hora == -1){
                    this.hora = 23;
                }
            }
        }
        return this;
    }

    public void imprimirHora(){
        String horaCompleta = "";
        String horas = "";
        String minutos = "";
        String segundos = "";

        if(this.hora < 10){
            horas = "0" + this.hora;
        } else {
            horas = "" + this.hora;
        }

        if(this.minutos < 10){
            minutos = "0" + this.minutos;
        } else {
            minutos = "" + this.minutos;
        }

        if(this.segundos < 10){
            segundos = "0" + this.segundos;
        } else {
            segundos = "" + this.segundos;
        }

        horaCompleta = horas + ":" + minutos + ":" + segundos;

        System.out.println(horaCompleta);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora < 0 || hora > 23){
            System.out.println("Imposible setear hora. Ingrese valor entre 0 y 23.");
        } else {
            this.hora = hora;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if(minutos < 0 || minutos > 59){
            System.out.println("Imposible setear minutos. Ingrese valor entre 0 y 59.");
        } else {
            this.minutos = minutos;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if(segundos < 0 || segundos > 59){
            System.out.println("Imposible setear segundos. Ingrese valor entre 0 y 59.");
        } else {
            this.segundos = segundos;
        }
    }

    //Clase Main
    public static void main(String[]args){
        Hora hora = new Hora();

        //Setear hora
        hora.setHora(23);
        hora.setMinutos(59);
        hora.setSegundos(59);

        //Mostrar Hora
        hora.imprimirHora();

        //Avanzar un segundo
        System.out.println("Avanzar un segundo la hora:");
        hora.avanzarUnSegundo().imprimirHora();

        //Retroceder un segundo
        System.out.println("Retroceder un segundo la hora:");
        hora.retrocederUnSegundo().imprimirHora();
    }
}
