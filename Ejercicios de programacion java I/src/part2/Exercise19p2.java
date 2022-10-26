package part2;

import java.util.Scanner;

public class Exercise19p2 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.print("1+2+3+...N\nInput N:");	
	int N=scanner.nextInt();
	scanner.close();
	int res=(N*(N+1))/2;
	System.out.println(res);
	
	}

}
