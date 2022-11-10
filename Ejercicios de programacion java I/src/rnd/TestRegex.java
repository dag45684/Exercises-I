package rnd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		
	Pattern p1 = Pattern.compile("[0-9]+"); //Any numerical value 1 or more times (+). (*) for 0 or more times.
	Pattern p2 = Pattern.compile("\\["); //The character [. A single slash would be interpreted as s Java escape seq. not a RegEx one.

	String s = "ab123nnnnnnnn321";
	String s2 = "123";
	
	Matcher m1 = p1.matcher(s);
	Matcher m2 = p1.matcher(s2);
	
//	System.out.println(m1.matches()); matches perfectly? t/f
//	System.out.println(m2.matches());
	
	System.out.println(m1.find()); //does contain? t/f
	System.out.println(m1.group()+" "+m1.start()+" "+m1.end()); // show me the expression and its indexes. Gotta use m.find() first.
	System.out.println(m1.find()); //does contain? t/f
	System.out.println(m1.group()+" "+m1.start()+" "+m1.end()); // can be used multiple times to iterate through strings.
	
	// testing
	
	String str = "carlosmgov@gmail.com";
	Pattern email = Pattern.compile("\"[a-z]{3,}\\@[a-z]{3,}\\.[a-z]{2,4}\"i");
	Matcher finder = email.matcher(str);
	System.out.println(finder.find() ? "Valid" : "Non valid");
	
	}

}
