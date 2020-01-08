package pkg.behavioral.state;

public class Ringing implements MobileAlertState {

    @Override
    public void alert() {
        System.out.println(" Mobile is Ringing ");
    }
}
