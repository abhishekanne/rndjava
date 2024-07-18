package excepionHandling;

import java.io.FileNotFoundException;

public class UncheckedException {

    public static void doSomething() throws  NullPointerException {

    }

    public static void doSomethingonFile() throws FileNotFoundException {

    }

    public static void main(String[] args)  {
        //No need to put try or use throws to handle unchecked exceptions
        //Unchecked Exceptions Example nullpointerException/ ArrayIndexOutofBoundException/ArithmaticException
        UncheckedException.doSomething();

        //However we need to handle the checked exception

        try {
            UncheckedException.doSomethingonFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
