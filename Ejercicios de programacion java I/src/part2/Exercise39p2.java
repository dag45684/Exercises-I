package part2;

import java.io.IOException;
import java.util.Scanner;

public class Exercise39p2 {
	
	public static void ProgressPrinter (int miss, String solv) {
		System.out.println(solv);
		switch(miss) {
		case 1:
			System.out.println("           ");
			System.out.println("           ");
			System.out.println("           ");
			System.out.println("           ");
			System.out.println("           ");
			System.out.println("__|__      ");
			break;
		case 2:
			System.out.println("           ");
			System.out.println("  /        ");
			System.out.println("  |        ");
			System.out.println("  |        ");
			System.out.println("  |        ");
			System.out.println("__|__      ");
			break;
		case 3:
			System.out.println("   _____   ");
			System.out.println("  /     |  ");
			System.out.println("  |        ");
			System.out.println("  |        ");
			System.out.println("  |        ");
			System.out.println("__|__      ");
			break;
		case 4:
			System.out.println("   _____   ");
			System.out.println("  /     |  ");
			System.out.println("  |     o  ");
			System.out.println("  |    /|\\ ");
			System.out.println("  |        ");
			System.out.println("__|__      ");
			break;
		case 5:
			System.out.println("   _____   ");
			System.out.println("  /     |  ");
			System.out.println("  |     o  ");
			System.out.println("  |    /|\\ ");
			System.out.println("  |     /\\ ");
			System.out.println("__|__      ");
			System.out.println("You lost!");
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentence to guess:");
		String data = scanner.next(); 
		String solv="";
		for (int i=0; i<data.length(); i++) {
			if (data.charAt(i)==' ') solv+=' ';
			else solv+='_';
		}
		System.out.println(solv);
		int miss=0;
		boolean end = false;
		while (!end) {
			System.out.println("Make a guess!\n");
			char c = scanner.next().charAt(0);
			boolean det=false;
			for (int i=0; i<data.length(); i++) {
				if (c==data.charAt(i)) {
					det=true;
					char[] temp = solv.toCharArray();
					temp[i] = c;
					solv = String.valueOf(temp);
				}
			}
			if (!det) miss++;
			ProgressPrinter(miss, solv);
			if (solv.equals(data) || miss==5) end=true;			
			c ='\0';
		}
		if (solv.equals(data)) System.out.println("\nYou won! \n" + solv);
		scanner.close();

	}

}
//TODO: somethings wrong check for line parsing 
