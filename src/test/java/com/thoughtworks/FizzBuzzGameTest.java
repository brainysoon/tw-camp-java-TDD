package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FizzBuzzGameTest {

    @Test
    public void should_return_Fizz_when_have_3() {

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.start(3);
        List<String> results = fizzBuzzGame.getResults();

        Assert.assertEquals("Fizz", results.get(2));
    }

    @Test
    public void should_return_Fizz_when_its_multiple_times_of_3() {

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.start(10);
        List<String> results = fizzBuzzGame.getResults();

        for (int i = 1; i < results.size(); i++) {
            if (i % 3 == 0) {
                Assert.assertEquals("Fizz", results.get(i - 1));
            }
        }
    }

    @Test
    public void should_return_Buzz_when_its_multiple_times_of_5() {

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.start(10);
        List<String> results = fizzBuzzGame.getResults();

        for (int i = 1; i < results.size(); i++) {
            if (i % 5 == 0) {
                Assert.assertEquals("Buzz", results.get(i - 1));
            }
        }
    }

    @Test
    public void should_return_Whizz_when_its_multiple_times_of_7() {

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.start(16);
        List<String> results = fizzBuzzGame.getResults();

        for (int i = 1; i < results.size(); i++) {
            if (i % 7 == 0) {
                Assert.assertEquals("Whizz", results.get(i - 1));
            }
        }
    }

    @Test
    public void should_return_FizzBuzz_when_its_both_times_of_3_and_5() {

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.start(16);
        List<String> results = fizzBuzzGame.getResults();

        for (int i = 1; i < results.size(); i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                Assert.assertEquals("FizzBuzz", results.get(i - 1));
            }
        }
    }

    @Test
    public void should_return_tow_words_when_its_tow_number_times() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.start(100);
        List<String> results = fizzBuzzGame.getResults();

        for (int i = 1; i < results.size(); i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                Assert.assertEquals("FizzBuzz", results.get(i - 1));
            }

            if (i % 3 == 0 && i % 7 == 0) {
                Assert.assertEquals("FizzWhizz", results.get(i - 1));
            }

            if (i % 5 == 0 && i % 7 == 0) {
                Assert.assertEquals("BuzzWhizz", results.get(i - 1));
            }

        }
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_exactly_times_of_three_number() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.start(140);
        List<String> results = fizzBuzzGame.getResults();

        Assert.assertEquals("FizzBuzzWhizz", results.get(104));
    }
}
