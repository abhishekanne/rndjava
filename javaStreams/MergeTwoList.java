package javaStreams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Merge two list in one using flatmap and sort
 */

public class MergeTwoList {

    public static void main(String[] args) {

        List<String> mumbaiIndiansPlayers =Arrays.asList("Hardik","Rohit","Jasprit");
        List<String> rcbPlayers =Arrays.asList("Virat","Gayle","ABD");

        List<List<String>> dividedByTeams= Arrays.asList(mumbaiIndiansPlayers,rcbPlayers);

        List<String> unitedByKingfishers=dividedByTeams.stream()
                .flatMap(Collection::stream)
                .sorted()
                .peek(System.out::println)
                .toList();

    }
}
