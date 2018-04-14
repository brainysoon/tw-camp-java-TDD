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
}
