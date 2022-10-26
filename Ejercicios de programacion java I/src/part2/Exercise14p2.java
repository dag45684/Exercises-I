package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise14p2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Input your ID number: ");
		int ID = Integer.parseInt(br.readLine());
		String temp = "TRWAGMYFPDXBNJZSQVHLCKE";
		System.out.println("\nYour complete ID is "+ID+temp.charAt(ID%23));
		
	}

}
