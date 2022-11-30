package rnd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.Normalizer;
import java.text.Normalizer.Form;

public class test {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
	
		String s = "Salón camión Érica pértiga manín";
		s = Normalizer.normalize(s, Normalizer.Form.NFKD).replaceAll("[^\\p{ASCII}]", "");
		
		System.out.println(s);

	}
}
