package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {
	
	//Finding people names in a text.

	public static void main(String[] args) {
		
		String data = "Hola me llamo Diego Armando Maradona y soy cocainomano. Cristiano Ronaldo es un friki, y Messi Chiquito.";
		
		Pattern rx = Pattern.compile("([A-Z][a-z]+[ ,.]){2,}");
		Matcher m = rx.matcher(data);
		
		System.out.println(m.find());
		System.out.println(m.group());
		System.out.println(m.find());
		System.out.println(m.group());
		System.out.println(m.find());
		System.out.println(m.group());

	}

}
