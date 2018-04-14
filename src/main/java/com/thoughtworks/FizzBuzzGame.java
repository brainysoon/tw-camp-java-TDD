package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        this.results = IntStream.rangeClosed(1, count)
                .collect(ArrayList::new, (list, value) -> {

                    if ((value + "").contains("3")) {
                        list.add("Fizz");
                    } else if ((value + "").contains("5")) {
                        list.add("Buzz");
                    } else if ((value + "").contains("7")) {
                        list.add("Whizz");
                    } else if (value % 3 == 0 || value % 5 == 0 || value % 7 == 0) {

                        String words = "";
                        if (value % 3 == 0) {
                            words += "Fizz";
                        }
                        if (value % 5 == 0) {
                            words += "Buzz";
                        }
                        if (value % 7 == 0) {
                            words += "Whizz";
                        }

                        list.add(words);
                    } else {
                        list.add(value + "");
                    }
                }, ArrayList::addAll);
    }

    public List<String> getResults() {
        return results;
    }
}


