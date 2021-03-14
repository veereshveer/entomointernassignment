package com.example.oppsprogramassesment;

import org.springframework.stereotype.Component;

@Component
public class CheckArmstrongNumber {
    public void FindArmstrongNumber(){
    int temp,c=0,a;
    int n=153;
    temp=n;
    while(n>0)
    {
        a=n%10;
        n=n/10;
        c=c+(a*a*a);
    }
    if(temp==c)
            System.out.println(temp+" is Armstrong Number");
    else
            System.out.println(temp+"is Not Armstrong Number");
}
}
