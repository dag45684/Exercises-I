package part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exercise20p3 {

	static int [][] ex;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean end = false;
		while (!end) {
			System.out.print("Insert Command\n>");
			instruction(br.readLine());
		} 
	}

	static boolean instruction (String instruction){
		Scanner scanner = new Scanner(instruction);
		try {
			String command = scanner.next("array|swap|print|end");
			switch (command) {
			case "array":
				array(scanner);
//				array(instruction);
				break;
			case "swap":
				swap(scanner);
				break;
			case "print":
				System.out.println(Arrays.toString(ex));
			default:
				scanner.close();
				return true;
			}
		}catch (NoSuchElementException e) {
			System.out.println("Wrong argument");
		}
		scanner.close();
		return false;
	}
	
	static void array (Scanner scanner) {
		try {
			scanner.skip("\\p{javaWhitespace}*");
			int n = Integer.parseInt(scanner.skip("\\d+").match().group());
			scanner.skip("x");
			int m = Integer.parseInt(scanner.skip("\\d+").match().group());
			scanner.skip(":");
			ex = new int[n][m];
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) ex[i][j] = scanner.nextInt();
			}
		}catch (NoSuchElementException | IllegalStateException | NumberFormatException e) {
			System.out.println("Wrong Command. Pattern is >array NxM: n1 n2 n3...");
		}
		System.out.println(Arrays.toString(ex));
	}
	
	static void swap (Scanner scanner) {
		try {
			int f = scanner.nextInt();
			int ff = scanner.nextInt();
			int s = scanner.nextInt();
			int ss = scanner.nextInt();
			int temp = ex[f][ff];
			ex[f][ff] = ex [s][ss];
			ex[s][ss] = temp;
		}catch (NoSuchElementException e) {
			System.out.println("Wrong command. Partter is >swap pos1.1 pos1.2 pos2.1 pos2.2");
		}
		System.out.println(Arrays.toString(ex));
	}
		
	
//	static void array (String instruction) {
//		
//		try {
//			int x = instruction.indexOf("x");
//			int semi = instruction.indexOf(":");
//			int n = Integer.valueOf(instruction.substring(0,x));
//			int m = Integer.valueOf(instruction.substring(x));
//			
//		}catch (NumberFormatException e) {
//			System.out.println("Wrong command. Format is:\nNxM: n1 n2 n3...");
//		}
//		
//	}
	
}
