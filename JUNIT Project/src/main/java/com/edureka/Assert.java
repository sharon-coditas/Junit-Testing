package com.edureka;


import org.junit.Test;

import static org.junit.Assert.*;


public class Assert {
    @Test
    public void testAssertion() {
        String str = new String("Coditas");
        String str1 = new String("Coditas");
        String str2 = null;
        String str3 = "Coditas";
        String str4 = "Coditas";
        int val = 5;
        int val1 = 6;
        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray = {"one", "two", "three"};

        //content equal or not
        assertEquals(str, str1);

        //check for true -> 5<6 ->True
        assertTrue(val < val1);

        //check for false -> return true
        assertFalse(val > val1); //false

        //check for not null -> return true
        assertNotNull(str1);

        //check for null -> return true
        assertNull(str2);

        //check if references to same object
        assertSame(str3, str4);

        assertNotSame(str, str1);

        assertArrayEquals(expectedArray, resultArray);
    }
}
