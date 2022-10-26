package part1;

import java.util.Scanner;

public class Exercise16p1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sum=0;
		int prod=1;
		for (int i=0; i<10; i++) {
			System.out.print("Number " + (i+1) + ": ");
			int temp = scanner.nextInt();
			sum += temp;
			prod *= temp; 
		}
		scanner.close();
		System.out.println("Suma" + sum);
		System.out.println("Producto" + prod);


	}

}
