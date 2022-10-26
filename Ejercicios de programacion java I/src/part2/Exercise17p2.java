package part2;

import java.util.Scanner;

public class Exercise17p2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input your name: ");
		long starttime = System.currentTimeMillis();
		String name=scanner.next();
		long elapsedtime = System.currentTimeMillis() - starttime;
		scanner.close();
		System.out.println("Hello, "+name+". It took you "+(float)(elapsedtime/1000f)+" seconds to input your name.");
		
	}
}
