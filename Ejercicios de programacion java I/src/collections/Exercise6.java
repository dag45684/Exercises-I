package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String rules = br.readLine();
		Scanner es = new Scanner(rules);
		int n = es.nextInt();
		int m = es.nextInt();
		String input = br.readLine();
		Scanner s = new Scanner(input);
		ArrayList<Integer> one = new ArrayList<>(); 
		ArrayList<Integer> two = new ArrayList<>(); 
		String[] check = input.split(" ");
		if (check.length != n+m) System.out.println("Wrong size input!");
		for (int i=0; i<n; i++) one.add(s.nextInt());
		for (int i=0; i<m; i++)	two.add(s.nextInt());
		ArrayList<Integer> result = new ArrayList<Integer>(); 
		for (int i=0; i<n; i++) if (two.contains(one.get(i))) result.add(one.get(i));
		System.out.println(result);
	}

}
