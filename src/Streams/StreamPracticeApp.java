package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPracticeApp {

	public static void main(String[] args) {

		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		
		//max value
		int maxNum = nums.stream().reduce((acc,next)-> Math.max(acc,next)).get();
		System.out.println("Max: " + maxNum);
		
		//minimum value
		int minNum = nums.stream().reduce((acc,next)-> Math.min(acc,next)).get();
		System.out.println("Min: " + minNum);
				
		//odd
		List<Integer> oddNums = nums.stream().filter(x-> x%2==1).collect(Collectors.toList());
		System.out.println("Odds: " + oddNums);
				
		//even
		List<Integer> evenNums = nums.stream().filter(x-> x%2==0).collect(Collectors.toList());
		System.out.println("Evens: " + evenNums);
	
		//sum
		int sumNums = nums.stream().reduce( (acc,next) -> acc+next).get();
		System.out.println("Sum: " + sumNums);
		
		//square, then remove evens, then find minimum
		int lotsNums = 
				nums.stream().
				map(x-> x*x).
				filter(x-> x%2==1).
				reduce( (acc,next)-> Math.min(acc, next))
				.get();
				
		System.out.println("function: " + lotsNums);
		
		
		
	}

}
