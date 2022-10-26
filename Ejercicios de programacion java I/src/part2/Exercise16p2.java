package part2;

import java.util.Random;
import java.util.Scanner;

public class Exercise16p2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int res = rand.nextInt(100) + 1;
		boolean hit=false;
		System.out.println("Guess the number!");
		int guess=scanner.nextInt();
		if (guess==res) hit=true;
		while (!hit) {
			if (guess>res) System.out.println("Nope! Go lower:");
			else if (guess<res) System.out.println("Nope! Go higher:");
			else break;
			guess=scanner.nextInt();
		}
		scanner.close();
		System.out.println("You guessed it!");
	}
}
