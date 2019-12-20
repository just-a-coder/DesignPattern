package pkg.creational.factory;

public abstract class Computer {

    public abstract int getRam();
    public abstract String getProcessor();
    public abstract boolean isPortable();
    
    @Override
    public String toString(){
        return "RAM= "+this.getRam()+", HDD="+this.getProcessor()+", CPU="+this.isPortable();
    }

}
