package com.java.feature.javafeature;

import org.junit.Test;
import static org.junit.Assert.*;
public class StringReverseTest {

    @Test
    public void test_reverseString(){
        StringReverse sr = new StringReverse();
        assertEquals("ihsir", sr.reverseString("rishi"));
    }
}
