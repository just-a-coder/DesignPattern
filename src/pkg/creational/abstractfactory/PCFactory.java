package pkg.creational.abstractfactory;

public class PCFactory  implements ComputerAbstractFactory{

    private int ram;
    private String processor;
    private boolean isPortable;

    public PCFactory(int ram, String processor, boolean isPortable) {
        this.ram = ram;
        this.processor = processor;
        this.isPortable = isPortable;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, processor, isPortable);
    }
}
