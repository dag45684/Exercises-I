package rnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RndFibonacci {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Select fibonacci index you want to reach:");
		int n = Integer.parseInt(br.readLine());
		System.out.println();
		for (int i=0; i<=n; i++) {
			System.out.print(fibonacci(i) + "   ");
		}
	}
	
	public static int fibonacci (int n) {
		if (n==1 | n==0) return n;
		else return fibonacci(n-1) + fibonacci(n-2);
	}

}
