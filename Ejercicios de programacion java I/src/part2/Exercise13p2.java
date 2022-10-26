package part2;

import java.util.Scanner;

public class Exercise13p2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers will you input:");
		int n = scanner.nextInt();
		System.out.println("Input them:");
		int res=0;
		for (int i=0; i<n; i++) {
			res += scanner.nextInt();
		}
		scanner.close();
		System.out.println("Average number is " + (res/n));
		
	}

}
