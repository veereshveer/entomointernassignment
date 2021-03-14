package com.example.oppsprogramassesment;

import org.springframework.stereotype.Component;

@Component
public class StringManipulation {
    // create 3 strings
    public void StringManipulation(){
    String firstString = "java programming";
    String secondString = "java programming";
    String thirdString = "python programming";

    // compare first and second strings

    int length=firstString.length();
        System.out.println("Length of "+firstString+" is "+length);

    boolean result = firstString.equalsIgnoreCase(secondString);
    System.out.println("Strings first and second are equal: " + result);

        String joinedString = firstString.concat(secondString);
        System.out.println("Strings after concat : " + joinedString);

        String subString =thirdString.substring(2,14);
        System.out.println(subString);

        String uppercaseString =thirdString.toUpperCase();
        System.out.println(uppercaseString);

      String trimString =secondString.trim();
        System.out.println(trimString);

        int index = firstString.indexOf("gra");
        System.out.println("Index of substring : " + index);

        String replace=  firstString.replace("java","Angular");
        System.out.println("String after replace :"+replace);

        StringBuilder objOfSB = new StringBuilder(secondString);
        String reveresString = objOfSB.reverse().toString();
        System.out.println(reveresString);
    }
}
