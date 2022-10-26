package part2;

import java.util.Scanner;

public class Exercise11p2 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);	
	int x=scanner.nextInt();
	scanner.close();
	
	if(x>0) System.out.println("positive");
	else if(x<0) System.out.println("negative");
	else System.out.println("zero");
	}
}
