package com.example.myapplication;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        System.out.println("begin addition_isCorrect");
        assertEquals(4, 2 + 2);
        System.out.println("end addition_isCorrect");
    }


    @Before
    public void setUp() throws Exception {
        System.out.println("Set up");
        //Log.d("junit","Set up");
    }


    @After
    public void tearDown() throws Exception {
        System.out.println("Tear down");
    }
}