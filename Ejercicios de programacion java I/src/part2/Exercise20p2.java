package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise20p2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Input a number:");
		int n = Integer.parseInt(br.readLine());
		for (int i=1; i<=10; i++) System.out.println(n+"x"+i+"="+i*n);

	}

}
