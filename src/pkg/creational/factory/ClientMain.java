package pkg.creational.factory;

public class ClientMain {
    public static void main(String[] args) {
        System.out.println(" Creating object in Factory Design Pattern");

        Computer PC = ComputerFactory.getComputer(ComputerType.PC,2,"corei5",false);
        System.out.println("RAM: "+PC.getRam()+" Processor: "+PC.getProcessor());

        Computer Laptop = ComputerFactory.getComputer(ComputerType.Laptop,4,"corei7",true);
        System.out.println("RAM: "+Laptop.getRam()+" Processor: "+Laptop.getProcessor());
    }
}
