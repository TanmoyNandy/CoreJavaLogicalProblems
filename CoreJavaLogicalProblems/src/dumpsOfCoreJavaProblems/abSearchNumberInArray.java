package dumpsOfCoreJavaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * WAP to accept 10 numbers and search a given number, taken from the user, from the array.
 * If the number is found print the first position or else print not found.
 * @author tanmoy
 */

public class abSearchNumberInArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		boolean blnResult = false;
		
		//Accepting 10 numbers from the user and storing in an array
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter a number to be searched for: ");
		int search = Integer.parseInt(br.readLine());
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println(search + " found at position = "+i);
				blnResult = true;
				break;
			}
		}
		if(!blnResult) {
			System.out.println(search + " is not found in the Array");
		}
	}

}
