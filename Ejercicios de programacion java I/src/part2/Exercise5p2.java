package part2;

import java.util.Scanner;

public class Exercise5p2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Travel time in seconds: ");
		int sec = scanner.nextInt();
		scanner.close();
		int res = 5;
		for (int i=1; i<=sec; i++) {
			res+= 5 + (2*i);
		}
		System.out.println(res+"m");
		
	}

}
