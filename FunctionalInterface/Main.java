package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("hellos");

        final Boolean flag=false;

        new ImplementingClass().onlyOneAbstractMethodAllowed();
        ParentInterface.staticMethod();

        ParentInterface lambdaImpl=()->{
            System.out.println("Lambda: Functional Interface implemented using Lambda");
        };
        lambdaImpl.onlyOneAbstractMethodAllowed();


        List<Long> list= new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        list.add(5L);



        long count = Stream.of(1, 2, 3, 4, 5)
                .filter(i -> i <4) // Intermediate Operation filter
                .count(); // Terminal Operation count

        long count2 = list.stream()
                .filter(i -> i <4) // Intermediate Operation filter
                .count(); // Terminal Operation count

        System.out.println("Stream Example : count = "+count);
        System.out.println("Stream Example : count2 = "+count2);



    }
}
