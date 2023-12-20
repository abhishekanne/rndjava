package concurrency;

import java.util.concurrent.Callable;

public class MyCallableJob implements Callable {
    @Override
    public Double call() throws Exception {
        return Math.random();
    }
}
