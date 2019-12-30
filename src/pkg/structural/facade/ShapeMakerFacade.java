package pkg.structural.facade;

/**
 *  This Facade creates an interface on top of Circle, Rectangle and Square classes.
 */
public class ShapeMakerFacade {
    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public ShapeMakerFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
