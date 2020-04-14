package ejercicio3;

public abstract class Figures {
    private String color;

    public Figures(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public abstract float getPerimeter();

    public abstract float getArea();
}
