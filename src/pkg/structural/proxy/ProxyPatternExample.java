package pkg.structural.proxy;

public class ProxyPatternExample {

    public static void main(String[] args) throws Exception {
/*        DataBaseExecutor nonAdminExecuter = new DataBaseExecutorProxy("NonAdmin", "Admin@123");
        nonAdminExecuter.executeDatabase("DELEE");

        DataBaseExecutor nonAdminExecuterDELETE = new DataBaseExecutorProxy("NonAdmin", "Admin@123");
        nonAdminExecuterDELETE.executeDatabase("DELETE");*/


        DataBaseExecutor adminExecuter = new DataBaseExecutorProxy("Admin", "Admin@123");
        adminExecuter.executeDatabase("DELETE");

    }
}