package pkg.creational.factory;

public class ComputerFactory {
    public static Computer getComputer(ComputerType computerType, int ram, String processor, boolean isPortable) {
        switch (computerType) {
            case PC:{
                return new PC(ram,processor,isPortable);
            }
            case Laptop:{
                return new Laptop(ram,processor,isPortable);
            }
            default:
                return null;
        }
    }
}
