package pkg.creational.singleton;

public class EarlyInitialization {
    private static EarlyInitialization earlyInitializationObj= new EarlyInitialization();

    private EarlyInitialization() { }

    public static EarlyInitialization getInstance() {
        if(earlyInitializationObj == null)
            earlyInitializationObj = new EarlyInitialization();

        return earlyInitializationObj;
    }
}
