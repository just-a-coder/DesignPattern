package pkg.behavioral.state;

public class MobileContext {
    private MobileAlertState currentState;

    public MobileContext() {
        currentState = new Ringing(); // default state
    }

    public void setState(MobileAlertState state) {
        currentState = state;
    }

    public void alert() {
        currentState.alert();
    }
}
