package week1.day2.assignment;

import java.util.Arrays;

public class FindSecondSmallest {

	public static void main(String[] args) {
		int[] input = {23,45,67,32,89,22};
		Arrays.sort(input);	
		System.out.println("the second largest number is"+ input[1]);
	}

}
