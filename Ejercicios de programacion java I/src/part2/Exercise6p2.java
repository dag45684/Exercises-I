package part2;

import java.util.Scanner;

public class Exercise6p2 {

	public static void main(String[] args) {
		
		final float PI= 3.14159f;
		//Math.PI can be used as well
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input radius: ");
		float r=scanner.nextFloat();
		scanner.close();
		
		System.out.println("Perimeter: " + (2*PI*r));
		System.out.println("Area: " + (PI*(r*r)));
		
	}

}

