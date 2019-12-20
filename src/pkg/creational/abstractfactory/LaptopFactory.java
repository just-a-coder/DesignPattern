package pkg.creational.abstractfactory;

public class LaptopFactory implements ComputerAbstractFactory {

    private int ram;
    private String processor;
    private boolean isPortable;

    public LaptopFactory(int ram, String processor, boolean isPortable) {
        this.ram = ram;
        this.processor = processor;
        this.isPortable = isPortable;
    }

    @Override
    public Computer createComputer() {
        return new Laptop(ram,processor,isPortable);
    }
}
