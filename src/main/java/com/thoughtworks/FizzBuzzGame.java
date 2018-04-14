package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        this.results = IntStream.rangeClosed(1, count)
                .collect(ArrayList::new, (list, value) -> {

                    if (value % 3 == 0) {
                        if (value % 5 == 0) {
                            list.add("FizzBuzz");
                            return;
                        }

                        list.add("Fizz");
                    } else if (value % 5 == 0) {

                        list.add("Buzz");
                    } else if (value % 7 == 0) {

                        list.add("Whizz");
                    } else {
                        list.add(value + "");
                    }
                }, ArrayList::addAll);
    }

    public List<String> getResults() {
        return results;
    }
}


