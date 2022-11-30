package rnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExercisesFromCPP {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int in = Integer.parseInt(br.readLine());
		String inp = br.readLine();
		
		System.out.println();
		System.out.println(reverse(in));
		System.out.println(reverse(inp));
		System.out.println();
		System.out.println(pal(in));
		System.out.println(pal(inp));
	}
	
	public static int reverse(int n) {
		
		String temp = Integer.toString(n);
		String res="";
		for (int i=temp.length()-1; i>=0; i--) {
			res += temp.charAt(i);
		}
		return Integer.valueOf(res);
	}
	
	public static String reverse(String n) {
		
		String res="";
		for (int i=n.length()-1; i>=0; i--) {
			res += n.charAt(i);
		}
		return res;
	}
	
	public static boolean pal (int n) {

		String temp = Integer.toString(n);
		for (int i=0; i<temp.length()/2; i++) {
			if (!(temp.charAt(i) == temp.charAt(temp.length()-(i+1)))) return false;
		}
		return true;
	}

	public static boolean pal (String n) {

		n = n.replace(" ", "");
		for (int i=0; i<n.length()/2; i++) {
			if (!(n.charAt(i) == n.charAt(n.length()-(i+1)))) return false;
		}
		return true;
	}
	

}
