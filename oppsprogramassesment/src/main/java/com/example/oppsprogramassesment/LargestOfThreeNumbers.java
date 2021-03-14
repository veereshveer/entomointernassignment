package com.example.oppsprogramassesment;

import org.springframework.stereotype.Component;

@Component
public class LargestOfThreeNumbers {
    public void FindLargestNumber(){
        int firstNumber = 100, secondNumber = 20, thirdNumber = 70;

        if( firstNumber >= secondNumber && firstNumber >= thirdNumber)
            System.out.println(firstNumber+" is the largest Number");

        else if (secondNumber >= firstNumber && secondNumber >= thirdNumber)
            System.out.println(secondNumber+" is the largest Number");

        else
            System.out.println(thirdNumber+" is the largest Number");
    }
}
