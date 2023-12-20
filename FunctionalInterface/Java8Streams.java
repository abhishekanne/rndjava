package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Streams {

    public static void main(String[] args) {

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


//How to create stream objects
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> numberStream = numbers.stream();
        Stream<Integer> newNumberStream = Stream.of(1,2,3,4,5,6,7,8,9,10);



        //map() function
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> cubedNumbers= numbers1.stream()
                .map(x -> x*x*x).collect(Collectors.toList());
        System.out.println(cubedNumbers);


        //Multiline map function
        List<Integer> cubedNumbers2= numbers1.stream()
                .map(x -> {int cube= (int) (x*x*x);
                return cube;}).collect(Collectors.toList());

        System.out.println(cubedNumbers2);

        //filter predicate

        List<Integer> numbers3 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(x -> x%2==0).collect(Collectors.toList());


        System.out.println(evenNumbers);

        //sort

        List<Integer> numbers4 = Arrays.asList(6,7,8,1,4,5,9,10,2,3);
        List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedList);

        //flatmap
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfNumbers = Arrays.asList(list1, list2, list3);

        List<Integer> listOfAllIntegers = listOfNumbers.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());



        System.out.println(listOfAllIntegers);

        //distinct
        List<String> countries = Arrays.asList("India", "Australia", "SriLanka","Russia", "Australia","SriLanka","India");

        List<String> distinctCountries = countries.stream().distinct().sorted()
                .collect(Collectors.toList());
        System.out.println(distinctCountries);



        //peek() intermediate
        Stream.of(1,2,3,4,5,6,7,8,9,0)
                .filter(x -> x%2 ==0)
                .peek(e -> System.out.println("The even numbers are : " + e))
                .collect(Collectors.toList());

        /** Terminal Methods
         * collect() for stream into collection
         * count() terminal operation helps us to find the count of the processed collection.
         * allMatch() operation helps us to get the answer: Do all the elements of the stream match the condition?
         * Anymatch() anyMatch() helps to check if either one of the elements in the stream matched the condition.
         * foreach() method is used to iterate over the resultant collection, same as that of the traditional for loop.
         */

        // collect()
        List listOfCountries = Arrays.asList("India", "Indonesia", "Nepal", "Afghanistan");

        List output = (List) listOfCountries.stream()
                .filter(x-> x.toString().startsWith("I"))
                .collect(Collectors.toList());
        System.out.println(output);

        //count

        System.out.println(Stream.of(1,2,3).count());

        //count exmample 2
        List listOfCountries2 = Arrays.asList("India", "Indonesia", "Nepal", "Afghanistan");

        long count1 = listOfCountries2.stream()
                .filter(x-> x.toString().startsWith("I"))
                .count();

        System.out.println(count1);


        // allmatch()
        List listOfCountries3 = Arrays.asList("India", "Indonesia", "Nepal", "Afghanistan");

        boolean areAllElementsStartingWithI = listOfCountries3.stream()
                .allMatch(x -> x.toString().startsWith("I"));

        System.out.println(areAllElementsStartingWithI);


// anymatch()
        List<String> listOfCountries4 = Arrays.asList("India", "Indonesia", "Nepal", "Afghanistan");

        boolean areAllElementsStartingWithI2 = listOfCountries4.stream()
                .anyMatch(x -> x.startsWith("I"));

        System.out.println(areAllElementsStartingWithI2);


        // foreach
        List<String> listOfCountries5 = Arrays.asList("India", "Indonesia", "Nepal", "Afghanistan");

        listOfCountries5.stream()
                .filter(x-> x.startsWith("I"))
                .forEach(System.out::println);


    }



}
