package pkg.creational.builder;

public class ClientMain {
    public static void main(String[] args) {
        System.out.println(" Create a new Computer using Builder Pattern.");

        Computer computer = new Computer.ComputerBuilder(4,"corei5")
                .bluetooth("enabled")
                .build();
        System.out.println(" ComputerDetails: "+computer);
    }
}
