class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}
public class CustomThro{
    static void check() throws MyException {
        throw new MyException("Custom Error");
    }
    public static void main(String[] args) {
        try {
            check();
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}