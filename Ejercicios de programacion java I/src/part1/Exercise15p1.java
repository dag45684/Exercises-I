package part1;

import java.util.Scanner;

public class Exercise15p1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("First number:");
			int x=scanner.nextInt();
			System.out.print("First number:");
			int y=scanner.nextInt();
			if (x==y) break;
			else System.out.println("la jodimos");
		}
		System.out.println("Cojonudo");
		scanner.close();

	}

}
