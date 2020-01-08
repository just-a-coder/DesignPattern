package pkg.behavioral.state;

public class Mobile {
    public static void main(String[] args) {
        MobileContext mobileContext = new MobileContext();
        mobileContext.alert();

        mobileContext.setState(new Silent());
        mobileContext.alert();


    }
}
