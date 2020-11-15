package dumpsOfCoreJavaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * WAP to accept a full name and print it in abbreviated format.
 * e,g, - 	
 * 		Input: Subhas Chandra Bose
 * 		Output: S.C. Bose
 * 
 * @author tanmoy
 */
public class adAbbreviatedName {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Full Name: ");
		String fullName = br.readLine();
		String abbreviatedName = fullName.charAt(0)+"";
		
		int lastSpace = 0;
		for(int i=1;i<fullName.length();i++) {
			if((fullName.charAt(i)+"").equals(" ")) {
				lastSpace = i;
				abbreviatedName+="."+fullName.charAt(i+1);
			}
		}
		abbreviatedName+=fullName.substring(lastSpace+2);
		System.out.println("Abbreviated name is = "+abbreviatedName);
	}
}