package part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exercise20p3 {

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
			String command = scanner.next("array|swap|end");
			switch (command) {
			case "array":
				array(scanner);
//				array(instruction);
				break;
			case "swap":
				swap(instruction);
				break;
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
	
	static void swap (String instruction) {
		
	}
}
