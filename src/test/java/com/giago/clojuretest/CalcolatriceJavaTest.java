package com.giago.clojuretest;

import org.junit.Test;
import com.example.clojure.calcolatrice;
import static junit.framework.Assert.assertEquals;

public class CalcolatriceJavaTest {

    @Test
    public void shouldBeAbleToCallSumOnClojureClass(){
        int sum = calcolatrice.somma(2, 3);
        assertEquals(5, sum);
    }

    @Test
    public void shouldBeAbleToCallSumWithNegativeNumbersOnClojureClass(){
        int sum = calcolatrice.somma(-2, -3);
        assertEquals(-5, sum);
    }

    @Test
    public void shouldBeAbleToCallSumUsingJavaWrapper(){
        int sum = calcolatrice.somma(2, 3);
        assertEquals(5, sum);
    }

    @Test
    public void shouldBeAbleToCallSumUsingJavaWrapperOnNegativeNumbers(){
        int sum = calcolatrice.somma(-2, -3);
        assertEquals(-5, sum);
    }
}
