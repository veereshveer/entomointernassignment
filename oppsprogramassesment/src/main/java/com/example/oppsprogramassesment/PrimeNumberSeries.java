package com.example.oppsprogramassesment;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class PrimeNumberSeries {
    void PrintPrimeNumber(){
    Scanner sc=new Scanner(System.in);
		System.out.print("Enter Starting Number : ");
    int printStart = sc.nextInt();
		System.out.print("Enter Ending Number : ");
    int printEnd = sc.nextInt();
		System.out.println("Prime numbers between "+printStart+" and "+printEnd+" are : ");
    int count;
		for(int i = printStart ; i <= printEnd ; i++)
    {
        //logic for checking number is prime or not
        count = 0;
//        int value=i/2;
        for(int j = 1 ; j <= i ; j++)
        {
            if(i % j == 0)
                count = count+1;
        }
        if(count == 2)
            System.out.println(i);
    }
}
    void CheckPrimeNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check prime or not  : ");
        int primeNumber = sc.nextInt();
        int count = 0;
//        int value=primeNumber/2;
        for(int j = 1 ; j <= primeNumber ; j++)
        {
            if(primeNumber % j == 0)
                count = count+1;
        }
        if(count == 2)
            System.out.println(primeNumber+" is prime number.");
        else
            System.out.println(primeNumber +" is not a prime number.");
}
}
