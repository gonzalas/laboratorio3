package ejercicio1;

public class Circle {
    private float radio;
    private String color;

    public Circle(){
        this.radio = 1;
        this.color = "red";
    }

    public Circle(float radio, String color){
        this.radio = radio;
        this.color = color;
    }

    public float getArea(){
        return (float) (Math.PI *  Math.pow(this.radio, 2));
    }

    @Override
    public String toString(){
        return "Circle -> Radio: " + this.radio + ", color: " + this.color + ", area: " + this.getArea() + ".";
    }

    public float getRadio(){
        return this.radio;
    }

    public String getColor(){
        return this.color;
    }
}
