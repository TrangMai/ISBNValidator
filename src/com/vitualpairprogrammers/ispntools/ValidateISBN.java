package com.vitualpairprogrammers.ispntools;

import org.junit.Test;

public class ValidateISBN {
    public boolean checkISBN(String isbn){
        //Check if input includes digits only
//        if (isbn.matches("[^0-9]+")) throw new NumberFormatException("ISBN must be a number only");


        //Ten digits condition
        if (isbn.length()!=10) throw new NumberFormatException("ISBN must be 10 digits long");

        //Validate check
        int total = 0;
        for (int i = 0; i < isbn.length(); i++){
            //Check if input includes digits only
            if (!Character.isDigit(isbn.charAt(i)))  throw new NumberFormatException("ISBN must contain numbers only");
            total += Character.getNumericValue(isbn.charAt(i))*(10-i);
        }
        return (total % 11 == 0);
    }
}
