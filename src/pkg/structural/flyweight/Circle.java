package pkg.structural.flyweight;

public class Circle implements Shape {

    private String color;
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", radius :" + radius);
    }
}
