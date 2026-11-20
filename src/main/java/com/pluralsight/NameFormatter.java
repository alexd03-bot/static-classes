package com.pluralsight;

public class NameFormatter {
    //last, pre first middle, suf

    public static String format(String prefix,
                                String firstName,
                                String middleName,
                                String lastName,
                                String suffix) {

        prefix = prefix.trim();
        firstName = firstName.trim();
        middleName = middleName.trim();
        lastName = lastName.trim();


        if (prefix.isEmpty()) {
            prefix = null;
        }
        if (lastName == null && lastName.isEmpty()) {
            throw new IllegalArgumentException("Please provide last name.");
        }
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Please provide first name.");
        }

        String result = "";
        result += lastName + ",";
        if (prefix != null) {
            result += prefix + " ";
        }



    }



}
