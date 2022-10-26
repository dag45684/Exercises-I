package part2;

import java.util.Scanner;

public class Exercise12p2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		double res=0;
		for (int i=1; i<=n; i++) {
			res += 1d/i;
		}
		
		System.out.println(res);
	}
}
