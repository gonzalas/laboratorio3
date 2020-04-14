package ejercicio1;

public class Cylinder extends Circle {
    private float height;

    public Cylinder(){
        super();
        this.height = 1;
    }

    public Cylinder(float radio, float height, String color){
        super(radio, color);
        this.height = height;
    }

    public float getVolume(){
        return super.getArea() * this.height;
    }

    @Override
    public float getArea(){
        return ((float) Math.PI * 2 * super.getRadio() * this.height + 2 * super.getArea());
    }

    @Override
    public String toString(){
        return "Cylinder -> Radio: " + super.getRadio() + ", color: " + super.getColor() + ", height: " + this.height + ", volume: " + this.getVolume() + ".";
    }

}
