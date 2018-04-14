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
}
