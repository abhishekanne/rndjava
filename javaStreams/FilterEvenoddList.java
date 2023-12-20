package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *  Filter out list odd and even by only using single pipeline
 */
public class FilterEvenoddList {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        Map<Boolean,List<Integer>>  pratitionMap= numbers.stream()
                .collect(Collectors.partitioningBy(i -> i%2==0));

        List<Integer> oddNumbers = pratitionMap.get(false);
        List<Integer> evenNumber = pratitionMap.get(true);

        System.out.println(oddNumbers);
        System.out.println(evenNumber);

    }
}
