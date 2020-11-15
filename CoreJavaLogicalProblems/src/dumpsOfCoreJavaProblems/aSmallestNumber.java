package dumpsOfCoreJavaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * WAP to accept 10 numbers in an array and print the smallest number with its position
 * @author tanmoy
 */
public class aSmallestNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		
		//Accepting the 10 Numbers
		for(int i=0;i<10;i++) {
			System.out.println("Enter a number in "+i+" element of the Array: ");
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int smallest = arr[0], pos = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
				pos = i;
			}
		}
		System.out.println("Smallest Number in the Array is : "+smallest);
		System.out.println("Position of the Smallest Number in the Array : "+pos);
	}
}
