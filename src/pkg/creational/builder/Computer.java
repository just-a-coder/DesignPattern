package pkg.creational.builder;

public class Computer {
    private int ram;
    private String processor;
    private String bluetooth;
    private String type;

    public int getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", processor='" + processor + '\'' +
                ", bluetooth='" + bluetooth + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    private Computer(ComputerBuilder computerBuilder) {
        this.ram = computerBuilder.ram;
        this.processor = computerBuilder.processor;
        this.bluetooth = computerBuilder.bluetooth;
        this.type = computerBuilder.type;
    }

    public static class ComputerBuilder{
        private int ram;
        private String processor;
        private String bluetooth;
        private String type;

        // All Mandatory Attributes will be inside the constructor
        public ComputerBuilder(int ram, String processor) {
            this.ram = ram;
            this.processor = processor;
        }

        // Setter Method For Optional Attribute
        public ComputerBuilder bluetooth(String bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        // Setter Method For Optional Attribute
        public ComputerBuilder type(String type) {
            this.type = type;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }
}
