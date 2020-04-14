package ejercicio3;

public class Circle extends Figures{
    private float radio;

    public Circle(){
        super("None");
        this.radio = 1;
    }

    public Circle(float radio, String color){
        super(color);
        this.radio = radio;
    }

    @Override
    public float getPerimeter() {
        return (float) Math.PI * 2 * this.radio;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(this.radio, 2));
    }

    @Override
    public String toString(){
        return "Circle -> Radio: " + this.radio
                + "\nColor: " + super.getColor()
                + "\nPerimeter: " + this.getPerimeter()
                + "\nArea: " + this.getArea()
                + "\n------------------------------------------------------------------";
    }
}
