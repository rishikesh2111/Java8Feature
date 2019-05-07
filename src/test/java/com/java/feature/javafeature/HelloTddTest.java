package com.java.feature.javafeature;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTddTest {

    @Test
    public void test_hello(){
        HelloTdd helloTdd = new HelloTdd();
        assertEquals("hello tdd", helloTdd.hello());
    }
}
