package concurrency;

import java.util.Date;
import java.util.concurrent.Callable;

public class MyThreadJob implements Runnable {
    @Override
    public void run()  {
        System.out.println(new Date());
    }
}
