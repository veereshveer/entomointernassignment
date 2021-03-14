package com.example.oppsprogramassesment;

import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class BubbleAndSelectionSort {
    public void SelectionSort() {
        int[] arr = {11, 4, 62, 8, 93};
        System.out.println("Selection Sort");

        System.out.println("Before Sorting");

        Arrays.stream(arr).forEach(System.out::println);


        for (int i = 0; i < arr.length - 1; i++) {

            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }


        System.out.println("After Sorting");

        Arrays.stream(arr).forEach(System.out::println);
    }
public void BubbleSort(){
    int arr[] = {64, 34, 25, 12, 22, 11, 90};

    int n = arr.length;
    System.out.println("Bubble Sort");

    System.out.println("Before sorting");
    Arrays.stream(arr).forEach(System.out::println);
    for (int i = 0; i < n-1; i++)
        for (int j = 0; j < n-i-1; j++)
            if (arr[j] > arr[j+1])
            {
                // swap temp and arr[i]
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }

    System.out.println("After Sorting");
    Arrays.stream(arr).forEach(System.out::println);

}
}
