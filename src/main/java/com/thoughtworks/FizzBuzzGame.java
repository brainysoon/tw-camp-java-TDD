package com.thoughtworks;

import java.util.*;
import java.util.stream.IntStream;


public class FizzBuzzGame {
    private static final String EMPTY_WORDS = "";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";
    public static final int SPECIAL_NUMBER_THREE = 3;
    private static final List<Integer> specialNumbers = Arrays.asList(3, 5, 7);
    public static final int SPECIAL_NUMBER_SEVEN = 5;

    private List<String> results = new ArrayList<>();

    public void start(int count) {
        this.results = IntStream.rangeClosed(1, count)
                .collect(ArrayList::new, (list, value) -> {

                    if (String.valueOf(value).contains(String.valueOf(SPECIAL_NUMBER_THREE))) {
                        list.add(mapNumberToWords(SPECIAL_NUMBER_THREE));
                    } else if (specialNumbers.stream()
                            .anyMatch(specialNumber -> canBeDivided(value, specialNumber))) {

                        list.add(specialNumbers.stream()
                                .reduce(EMPTY_WORDS, (words, specialNumber) -> {
                                    if (canBeDivided(value, specialNumber)) {
                                        return words.concat(mapNumberToWords(specialNumber));
                                    }
                                    return words;
                                }, String::concat));
                    } else {
                        list.add(String.valueOf(value));
                    }
                }, ArrayList::addAll);
    }

    public List<String> getResults() {
        return results;
    }

    private boolean canBeDivided(int target, int divider) {
        return target % divider == 0;
    }

    private String mapNumberToWords(int number) {
        if (number == SPECIAL_NUMBER_THREE) {
            return FIZZ;
        } else if (number == SPECIAL_NUMBER_SEVEN) {
            return BUZZ;
        } else {
            return WHIZZ;
        }
    }
}


