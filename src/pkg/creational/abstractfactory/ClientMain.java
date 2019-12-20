package pkg.creational.abstractfactory;



public class ClientMain {
    public static void main(String[] args) {
        System.out.println(" Creating object in Factory Design Pattern");

        Computer PC = ComputerFactory.getComputer(new PCFactory(2,"corei5",false));
        System.out.println("PC: "+PC);

        Computer Laptop = ComputerFactory.getComputer(new LaptopFactory(4,"corei7",true));
        System.out.println("Laptop: "+Laptop);
    }
}
