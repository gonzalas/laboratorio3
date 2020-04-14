package ejercicio3;

public class Square extends Rectangle {

    public Square(){
        super(1, 1, "None");
    }

    public Square(float side, String color){
        super(side, side, color);
    }

    @Override
    public String toString(){
        return "Square -> Side: " + super.getHeight()
                + "\nColor: " + super.getColor()
                + "\nPerimeter: " + this.getPerimeter()
                + "\nArea: " + this.getArea()
                + "\n------------------------------------------------------------------";
    }
}
