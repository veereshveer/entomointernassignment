package com.example.oppsprogramassesment;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class SumOfTwoNumber {
   public void sumOfGivenNumber(){
       int c, n,array[];

       Scanner in = new Scanner(System.in);
       System.out.println("Enter number of elements");
       n = in.nextInt();
       array = new int[n];

       System.out.println("Enter those " + n + " elements");

       for (c = 0; c < n; c++)
           array[c] = in.nextInt();
        int sum = addNumbers(array, n);
        System.out.println("Sum of given numbers is : " + sum);
    }

    public  int addNumbers(int array[],int n) {
       int c,total = 0;
        for (c = 0; c <n; c++)
        {
            total+=array[c];
        }
return total;
    }
public void sumOfNumber(){
//    int number = 25, count = 1, total = 0;
//
//    while(count <= number)
//    {
//        total = total + count;
//        count++;
//    }
    int c, n, total = 0,array[];

    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements");
    n = in.nextInt();
    array = new int[n];

    System.out.println("Enter those " + n + " elements");

    for (c = 0; c < n; c++)
        array[c] = in.nextInt();
    for (c = 0; c <n; c++)
    {
        total+=array[c];
    }
    System.out.println("Sum of given numbers is: "+total);

}
}


