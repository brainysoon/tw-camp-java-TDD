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
        fizzBuzzGame.start(60);
        List<String> results = fizzBuzzGame.getResults();

        Assert.assertEquals("FizzBuzz", results.get(59));
    }

    @Test
    public void should_return_tow_words_when_its_tow_number_times() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.start(150);
        List<String> results = fizzBuzzGame.getResults();

        Assert.assertEquals("FizzBuzz", results.get(59));

        Assert.assertEquals("FizzWhizz", results.get(20));

        Assert.assertEquals("BuzzWhizz", results.get(139));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_exactly_times_of_three_number() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.start(210);
        List<String> results = fizzBuzzGame.getResults();

        Assert.assertEquals("FizzBuzzWhizz", results.get(209));
    }

    @Test
    public void should_return_word_when_its_contain_special_number() {

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.start(13);
        List<String> results = fizzBuzzGame.getResults();

        Assert.assertEquals("Fizz", results.get(12));
    }

    @Test
    public void should_ignore_divided_rule_if_its_contain_first_special_number() {

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.start(79);
        List<String> results = fizzBuzzGame.getResults();

        Assert.assertEquals("Fizz", results.get(34));
        Assert.assertEquals("17", results.get(16));
        Assert.assertEquals("FizzBuzz", results.get(14));
    }
}
