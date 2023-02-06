package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Exercise3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		HashSet<String> repeating = new HashSet<>();
		HashSet<String> nonRepeating = new HashSet<>();
		String[] sep = br.readLine().split(" ");
		for (String s : sep) {
			if (!nonRepeating.contains(s) && !repeating.contains(s)) {
				nonRepeating.add(s);
			}
			else {
				nonRepeating.remove(s);
				repeating.add(s);
			}
		}
		System.out.println(); //TODO: add the array sysout
	}

}
