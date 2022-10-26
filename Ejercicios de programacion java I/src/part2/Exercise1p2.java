package part2;

import java.util.Scanner;

public class Exercise1p2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input your name:");
		String name = scanner.next();
		System.out.print("Input your age:");
		int age = scanner.nextInt();
		System.out.print("Input your adress:");
		String adress = scanner.next();
		scanner.close();
		
		System.out.println("\nThis is your data:");
		System.out.println(name);
		System.out.println(age + " years old");
		System.out.println(adress);
	}

}
