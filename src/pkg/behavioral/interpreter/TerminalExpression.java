package pkg.behavioral.interpreter;

/**
 *  This interpreter
 *  just check if the data is same as the
 *  interpreter data.
 */
public class TerminalExpression implements  Expression{
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String con) {
        if(con.contains(data))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
