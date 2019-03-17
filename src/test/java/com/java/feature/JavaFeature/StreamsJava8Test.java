package com.java.feature.JavaFeature;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StreamsJava8Test {

    StreamsJava8 streamsJava8 = new StreamsJava8();

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void sumDoublesDivisibleBy3() {
      assertEquals(36, streamsJava8.sumDoublesDivisibleBy3(1, 10));
    }

    @Test
    public void sumDoublesDivisibleBy3Peek() {
    }

    @Test
    public void isPalindrom() {
    }

    @Test
    public void isPalindromStream() {
        assertTrue(Stream.of("Madam").allMatch(streamsJava8::isPalindrom));
        assertTrue("madam", streamsJava8.isPalindromStream("madamq"));
    }
}