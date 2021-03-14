package com.example.oppsprogramassesment;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class LinearAndBinarySearch {
    public void LinerSearch(){

        int c, n, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter those " + n + " elements");

        for (c = 0; c < n; c++)
            array[c] = in.nextInt();

        System.out.println("Enter value to find");
        search = in.nextInt();

        for (c = 0; c < n; c++)
        {
            if (array[c] == search)     /* Searching element is present */
            {
                System.out.println(search + " is present at location " + (c + 1) + ".");
                break;
            }
        }
        if (c == n)  /* Element to search isn't present */
            System.out.println(search + " isn't present in array.");
    }
    public void BinarySearch(){
        int c, n, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter those " + n + " elements");

        for (c = 0; c < n; c++)
            array[c] = in.nextInt();

        System.out.println("Enter value to find");
        search = in.nextInt();
        int l = 0, r = array.length - 1,result;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (array[m] == search)
                result= m;

            // If x greater, ignore left half
            if (array[m] < search)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        result= -1;

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);


    }
}
