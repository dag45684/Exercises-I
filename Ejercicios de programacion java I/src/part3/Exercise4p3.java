package part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4p3 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] results = new int[6];
		System.out.println("Select die throws:");
		int t = Integer.parseInt(br.readLine());
		for (int i=0; i<t; i++) {
			results[((int)(Math.random()*6))]+=1;
		}
		for (int i=0; i<6; i++) {
			System.out.println("Times "+(i+1)+": "+results[i]);
		}
	}

}
