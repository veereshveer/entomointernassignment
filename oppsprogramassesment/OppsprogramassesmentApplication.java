package com.example.oppsprogramassesment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OppsprogramassesmentApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext Context= SpringApplication.run(OppsprogramassesmentApplication.class, args);

		CheckArmstrongNumber ObjectOfArmstrong=Context.getBean(CheckArmstrongNumber.class);
		ObjectOfArmstrong.FindArmstrongNumber();

		FibonacciSeries ObjectOfFibonacciSeries=Context.getBean(FibonacciSeries.class);
		ObjectOfFibonacciSeries.FindFibonacciSeries();

		LargestOfThreeNumbers ObjectOfLargestOfThreeNumbers=Context.getBean(LargestOfThreeNumbers.class);
		ObjectOfLargestOfThreeNumbers.FindLargestNumber();

		PalindromeOfNumberAndString ObjectOfPalindromeOfNumberAndString=Context.getBean(PalindromeOfNumberAndString.class);
		ObjectOfPalindromeOfNumberAndString.FindPalindromeNumber();
		ObjectOfPalindromeOfNumberAndString.FindPalindromeString();

		PrimeNumberSeries ObjectOfPrimeNumberSeries =Context.getBean(PrimeNumberSeries.class);
		ObjectOfPrimeNumberSeries.PrintPrimeNumber();
		ObjectOfPrimeNumberSeries.CheckPrimeNumber();

		SumOfTwoNumber ObjectOfSumOfTwoNumber =Context.getBean(SumOfTwoNumber.class);
		ObjectOfSumOfTwoNumber.sumOfNumber();
		ObjectOfSumOfTwoNumber.sumOfGivenNumber();

		SwapingOfTwoNumber ObjectOfSwapOfTwoNumber =Context.getBean(SwapingOfTwoNumber.class);
		ObjectOfSwapOfTwoNumber.SwapOfTwoNumber();
		ObjectOfSwapOfTwoNumber.SwapOfTwoNumbers();


		LinearAndBinarySearch ObjectOfLinearAndBinarySearch =Context.getBean(LinearAndBinarySearch.class);
		ObjectOfLinearAndBinarySearch.LinerSearch();
		ObjectOfLinearAndBinarySearch.BinarySearch();

		BubbleAndSelectionSort ObjectOfBubbleAndSelectionSort =Context.getBean(BubbleAndSelectionSort.class);
		ObjectOfBubbleAndSelectionSort.BubbleSort();
		ObjectOfBubbleAndSelectionSort.SelectionSort();

		StringManipulation ObjectOfStringManipulation =Context.getBean(StringManipulation.class);
		ObjectOfStringManipulation.StringManipulation();



	}

}
