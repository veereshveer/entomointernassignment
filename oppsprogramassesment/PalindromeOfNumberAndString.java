package com.example.oppsprogramassesment;

import org.springframework.stereotype.Component;

@Component
public class PalindromeOfNumberAndString {
    public void FindPalindromeNumber(){
        int number = 121, reversedInteger = 0, remainder, originalInteger;

        originalInteger = number;

        while( number != 0 )
        {
            remainder = number % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            number  /= 10;
        }

        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }

    public void FindPalindromeString() {
        String StringValue="VeeV";
       String originalString=StringValue.toLowerCase();
        StringBuilder StringBuilder=new StringBuilder(originalString);
        StringBuilder.reverse();
        String rev=StringBuilder.toString();
        if(originalString.equals(rev)){
            System.out.println(StringValue+" is a palindrome");
  }else{
            System.out.println(StringValue+" is not a palindrome");        }
    }

    }
