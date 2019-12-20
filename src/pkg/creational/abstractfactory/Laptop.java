package pkg.creational.abstractfactory;

public class Laptop extends Computer {
    int ram;
    String processor;
    boolean isPortable;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public boolean isPortable() {
        return isPortable;
    }

    public void setPortable(boolean portable) {
        isPortable = portable;
    }

    public Laptop(int ram, String processor, boolean isPortable) {
        this.ram = ram;
        this.processor = processor;
        this.isPortable = isPortable;
    }
}
