package ejercicio3;

public class Rectangle extends Figures {
    private float height;
    private float weight;

    public Rectangle(){
        super("None");
        this.weight = 2;
        this.height = 1;
    }

    public Rectangle(float height, float weight, String color){
        super(color);
        this.height = height;
        this.weight = weight;
    }

    public float getHeight(){
        return this.height;
    }

    @Override
    public float getPerimeter() {
        return (this.height * 2) + (this.weight * 2);
    }

    @Override
    public float getArea() {
        return this.height * this.weight;
    }

    @Override
    public String toString(){
        return "Rectangle -> Height: " + this.height + " - Weight: " + this.weight
                + "\nColor: " + super.getColor()
                + "\nPerimeter: " + this.getPerimeter()
                + "\nArea: " + this.getArea()
                + "\n------------------------------------------------------------------";
    }
}
