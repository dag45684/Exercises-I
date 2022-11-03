package rnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExerciseStrings1 {

	public static void main(String[] args) throws IOException {
		
		// Invert string input
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input a phrase:");
		String s = br.readLine();
		StringBuilder str = new StringBuilder();
		for (int i=0; i<s.length(); i++) {
			str.append(s.charAt((s.length()-1)-i));
		}
		System.out.println(str);

	}

}
