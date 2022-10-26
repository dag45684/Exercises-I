package part2;

import java.util.Scanner;

public class Exercise8p2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the R, G and B values:");
		int R=scanner.nextInt();
		int G=scanner.nextInt();
		int B=scanner.nextInt();
		scanner.close();
		
		float y = 0.299f * R + 0.587f * G + 0.114f * B;
		float i = 0.596f * R - 0.275f * G - 0.321f * B;
		float q = 0.212f * R - 0.528f * G - 0.311f * B;
		
		System.out.println("YIQ values are: "+y+","+i+","+q);
	}
}
