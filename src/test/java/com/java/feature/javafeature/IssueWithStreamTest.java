package com.java.feature.javafeature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class IssueWithStreamTest {

    IssueWithStream issueWithStream = new IssueWithStream();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void nonNullStringPass() {
      //  assertEquals("this is a non null string",issueWithStream.nonNullString());
    }
    @Test
    public void nonNullString() {
      // assertTrue(Objects.deepEquals("this is a non null string", issueWithStream.nonNullString()));
    }
}