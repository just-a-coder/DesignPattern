package pkg.structural.facade;

public class ClientMain {
    public static void main(String[] args) {
        ShapeMakerFacade shapeMakerFacade = new ShapeMakerFacade();

        shapeMakerFacade.drawCircle();
        shapeMakerFacade.drawRectangle();
        shapeMakerFacade.drawSquare();

    }
}
