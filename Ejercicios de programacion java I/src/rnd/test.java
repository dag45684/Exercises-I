package rnd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		
		int [] n = {1,2,3,4,5,6,7,8,9};
		for (int i=0; i<n.length; i++) {
			System.out.println(operation(n[i]));
		}
	}
	
	public static int operation (int n) {
		return ((n+2)-1)*3;
	}

}
