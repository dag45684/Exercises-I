package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Exercise28p2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input the digit length of the number");
		int l=Integer.parseInt(br.readLine());
		Random rnd = new Random();
		String temp="";
		for (int i=0; i<l; i++) {
			int n = rnd.nextInt(5-1)+1;  // Generates rnd int between (max-min)
			temp += Character.forDigit(n,10); // Changes int to char
		}
		// Number creation. String status.
		
		for (int i=0; i<l; i++) {
			System.out.println("\nLets guess the " + (i+1) + " number:");
			while (true) {
				int res = Integer.parseInt(br.readLine());
				if (Character.getNumericValue(temp.charAt(i))>res)
					System.out.println("Its a higher number");
				if (Character.getNumericValue(temp.charAt(i))<res)
					System.out.println("Its a lower number");
				if (Character.getNumericValue(temp.charAt(i))==res) {
					System.out.println("Correct!");
					break;	
				}
			}
			System.out.println("The correct number so far is: " );
			for (int j=0; j<=i; j++) {
				System.out.print(temp.charAt(j));
			}
		}
		// the fucking game
		
		System.out.println("Success! The number is " + temp);
		
	}

}
