package concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurencyMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executers= Executors.newFixedThreadPool(2);
        MyCallableJob thread1= new MyCallableJob();
        MyThreadJob thread2= new MyThreadJob();

        Future<Double> thread1Result = executers.submit(thread1);
        executers.submit(thread2);

        System.out.println(thread1Result.get());
        //System.out.println(thread2Result.get());

    }
}
