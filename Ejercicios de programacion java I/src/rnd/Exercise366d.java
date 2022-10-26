package rnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise366d {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input a year");
		int y = Integer.parseInt(br.readLine());
		System.out.println((y%4==0 && y%100!=0) || (y%4==0 && y%100==0 && y%400==00) ? "leap year" : "non leap year");
		
	}
}
