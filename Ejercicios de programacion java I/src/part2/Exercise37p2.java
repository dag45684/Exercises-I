package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise37p2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Input first word");
		String a=br.readLine();
		System.out.println("Input second word");
		String b=br.readLine();
		System.out.println(a.length()>b.length() ? "\nFirst word is shorter" : "\nSecond word is shorter");

	}

}
