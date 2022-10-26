package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Exercise38p2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Input a sentence:");
		String data = br.readLine();
		Map<Character, Integer> res = new HashMap<>(); 
		
		for (int i=0; i<data.length(); i++) {
			if(data.charAt(i)==' ') continue;
			if(!(res.containsKey(data.charAt(i)))) res.put(data.charAt(i), 1);
			else res.put(data.charAt(i), res.get(data.charAt(i))+1);
		}
		
		System.out.println("This sentence contains the following letters: \n" + res);

	}

}
