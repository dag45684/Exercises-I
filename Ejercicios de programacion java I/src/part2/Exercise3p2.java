package part2;

import java.util.Scanner;

public class Exercise3p2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Euros to convert: ");
		int euro=scanner.nextInt();
		scanner.close();
		float dollar=0.92f; // dollar value
		float res=dollar*euro;
		System.out.println(res + " Dollar");
	}
}
