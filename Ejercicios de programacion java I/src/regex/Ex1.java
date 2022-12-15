package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

	public static void main(String[] args) {
		
	String s = "xyzactmaacbfgh";
	Pattern rx = Pattern.compile("a+cb*");
	Matcher m = rx.matcher(s);
	System.out.println(m.matches());
	System.out.println(m.find());
	System.out.println(m.find());
	System.out.println(m.find());
	System.out.println();
	m.reset();

	while (m.find()){
		System.out.println(m.group());
	}
	
// "[^\?\,\|\]\}\[\{\'\"\+\=\-\/\!\#\$\$\%\^\&\*\(\)\+\\\>\<\;\:\n]{5-25}[@][A-Za-z]{3,10}[.][a-zA-Z]{2,4}"
	}

}
