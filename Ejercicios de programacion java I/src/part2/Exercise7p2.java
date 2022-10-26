package part2;

import java.util.Scanner;

public class Exercise7p2 {

	public static void main(String[] args) {
		
		// final double G = 0.000000000067d;
		final double G = 6.673e-11;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input mass m1:");
		double m1=scanner.nextDouble();
		System.out.println("Input mass m2:");
		double m2=scanner.nextDouble();
		System.out.println("Input distance:");
		double d=scanner.nextDouble();
		scanner.close();
		
		double F = G * ((m1*m2) / Math.pow(d, 2));
		System.out.println(F);
		
	}
}
