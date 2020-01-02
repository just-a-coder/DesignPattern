package pkg.structural.proxy;

class DataBaseExecutorProxy implements DataBaseExecutor {
    boolean ifAdmin;
    DataBaseExecutorImpl dbExecuter;

    public DataBaseExecutorProxy(String name, String passwd) {
        if(name == "Admin" && passwd == "Admin@123") {
            ifAdmin = true;
        }
        dbExecuter = new DataBaseExecutorImpl();
    }

    @Override
    public void executeDatabase(String query) throws Exception {
        if(ifAdmin) {
            dbExecuter.executeDatabase(query);
        } else {
            if(query.equals("DELETE")) {
                throw new Exception("DELETE not allowed for non-admin user");
            } else {
                dbExecuter.executeDatabase(query);
            }
        }
    }
}