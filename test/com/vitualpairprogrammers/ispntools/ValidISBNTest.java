package com.vitualpairprogrammers.ispntools;

import org.junit.Test;

import static org.junit.Assert.*;


public class ValidISBNTest {
    @Test
    public void checkValidISBN(){
//        fail();
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0321356683");
        assertTrue("First value",result);
        result = validator.checkISBN("1492032646");
        assertTrue("Second value",result);
    }

    @Test
    public void checkInvalidISBN(){

        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("1492032647");
        assertFalse(result);
    }

    @Test(expected = NumberFormatException.class)
    public void nineDigitISBNsAreNotAllowed(){
        ValidateISBN validator = new ValidateISBN();
        validator.checkISBN("49203264");
    }

    @Test(expected = NumberFormatException.class)
    public void numNumericISBNsAreNotAllowed(){
        ValidateISBN validator = new ValidateISBN();
        validator.checkISBN("149203264h");
    }
}
