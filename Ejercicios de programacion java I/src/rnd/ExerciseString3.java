package rnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExerciseString3 {

	public static void main(String[] args) throws IOException {
		
		// read two strings then check how many times one is within the other
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input a long phrase");
		String s1 = br.readLine();
		System.out.println("Input a short phrase");
		String s2 = br.readLine();
		
		int cnt=0;
		int res=0;
		while (s1.indexOf(s2, cnt)!=-1) {
			res++;
			cnt = s1.indexOf(s2, cnt)+1;
		}
		
		System.out.println("Second phrase appears "+res+" times within the other");
	}

}
