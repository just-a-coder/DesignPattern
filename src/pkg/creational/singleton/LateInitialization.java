package pkg.creational.singleton;

public class LateInitialization {

    private static LateInitialization lateInitializationObj= new LateInitialization();

    private LateInitialization() { }

    public static LateInitialization getInstance() {
        return lateInitializationObj;
    }
}
