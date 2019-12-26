package pkg.creational.singleton;

public class ClientMain {
    public static void main(String[] args) {
        EarlyInitialization earlyInitializationObj1 = EarlyInitialization.getInstance();
        EarlyInitialization earlyInitializationObj2 = EarlyInitialization.getInstance();
        if(earlyInitializationObj1==earlyInitializationObj2)
            System.out.println(" Both EarlyInitialization Objects are equal");

        LateInitialization lateInitializationObj1 = LateInitialization.getInstance();
        LateInitialization lateInitializationObj2 = LateInitialization.getInstance();
        if(lateInitializationObj1==lateInitializationObj2)
            System.out.println(" Both LateInitialization Objects are equal");

        SynchronizedSingleton synchronizedSingletonObj1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton synchronizedSingletonObj2 = SynchronizedSingleton.getInstance();
        if(synchronizedSingletonObj1==synchronizedSingletonObj2)
            System.out.println(" Both SynchronizedSingleton Objects are equal");
    }
}
