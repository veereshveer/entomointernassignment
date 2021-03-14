package com.example.oppsprogramassesment;

import org.springframework.stereotype.Component;

@Component
public class FibonacciSeries {
      void FindFibonacciSeries(){
        int firstNumber=0,secondNumber=1,sumOfTwoNumber,i,count=10,number=13,fibonacci=0;
        System.out.println(" "+firstNumber+"\n "+secondNumber);//printing 0 and 1
        if(number==0 || number==1)
            fibonacci=1;
        for(i=2;i<count;++i)
        {
            sumOfTwoNumber=firstNumber+secondNumber;
            System.out.println(" "+sumOfTwoNumber);
            // here it will check this number is present in fibonacci series or not
            if(sumOfTwoNumber==number)
                fibonacci=1;
            firstNumber=secondNumber;
            secondNumber=sumOfTwoNumber;
        }
         if(fibonacci==1)
             System.out.println(number+" is a part of fibonacci number");
         else
             System.out.println(number+" is Not a part of fibonacci number");
    }
}
