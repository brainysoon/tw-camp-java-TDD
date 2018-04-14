package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class FizzBuzzGame {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final String EMPTY_WORDS = "";

    private List<String> results = new ArrayList<>();

    public void start(int count) {
        this.results = IntStream.rangeClosed(1, count)
                .collect(ArrayList::new, (list, value) -> {

                    if (String.valueOf(value).contains(String.valueOf(3))) {
                        list.add(FIZZ);
                    } else if (value % 3 == 0 || value % 5 == 0 || value % 7 == 0) {

                        String words = EMPTY_WORDS;
                        if (value % 3 == 0) {
                            words += FIZZ;
                        }
                        if (value % 5 == 0) {
                            words += BUZZ;
                        }
                        if (value % 7 == 0) {
                            words += WHIZZ;
                        }

                        list.add(words);
                    } else {
                        list.add(String.valueOf(value));
                    }
                }, ArrayList::addAll);
    }

    public List<String> getResults() {
        return results;
    }
}


