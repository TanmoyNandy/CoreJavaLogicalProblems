package dumpsOfCoreJavaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * WAP to accept 10 numbers in an Array and print:
 * a) The sum of all positive odd numbers
 * b) Sum of all negative even numbers
 * 
 * @author tanmoy
 */

public class acSumOfOddEvenNumbers {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		
		//Accepting 10 numbers
		System.out.println("Enter 10 numbers: ");
		for(int i=0;i<10;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int sumOfPosOdd = 0;
		int sumOfNegEven = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0 && arr[i]%2==0) {
				sumOfNegEven+=arr[i];
			}
			else if(arr[i]>0 && arr[i]%2==1) {
				sumOfPosOdd+=arr[i];
			}
		}
		System.out.println("Sum of Positive Odd Numbers = "+sumOfPosOdd);
		System.out.println("Sum of negative Even Numbers = "+sumOfNegEven);
	}
}
