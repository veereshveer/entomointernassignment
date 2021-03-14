package com.example.oppsprogramassesment;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class SwapingOfTwoNumber {
    public void SwapOfTwoNumber(){

        int firstNumber, secondNumber, tempVariable;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        firstNumber = sc.nextInt();
        System.out.println("Enter the second number");
        secondNumber = sc.nextInt();
        System.out.println("before swapping numbers first number ="+firstNumber +" second number ="+ secondNumber);
        //swapping
        tempVariable = firstNumber;
        firstNumber = secondNumber;
        secondNumber = tempVariable;
        System.out.println("After swapping first number ="+firstNumber +" second number=  " + secondNumber);
        System.out.println( );
    }
    public void SwapOfTwoNumbers(){

        int firstNumber, secondNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        firstNumber = sc.nextInt();
        System.out.println("Enter the second number");
        secondNumber = sc.nextInt();
        System.out.println("before swapping numbers first number ="+firstNumber +" second number ="+ secondNumber);
        //swapping
        firstNumber = firstNumber+secondNumber;
        secondNumber = firstNumber-secondNumber;
        firstNumber = firstNumber-secondNumber;
        System.out.println("After swapping first number ="+firstNumber +" second number=  " + secondNumber);
        System.out.println( );
    }
}
