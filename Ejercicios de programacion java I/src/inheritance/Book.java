package inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class Book extends Rent{ //abstract avoids the user from creating instances of this class.
	
	ArrayList<String> authors;
	
	public Book (String author, String title, int code, boolean available, int year) {
		super(title, code, year, available);
		authors.add(author);
	}

	public Book (String title, int code, boolean available, int year, String ... author) { // ... stands for variable sized array from input
		super(title, code, year, available);
		for (String s : author) {
			authors.add(s);
		}
	}
	
	public boolean addAuthor(String author) {
		if (authors.contains(author)) {
			return false;
		}
		else {
			authors.add(author);
			return true;
		}
	}

	public List<String> getAuthors() {return Collections.unmodifiableList(authors);}

	@Override
	public String toString() {
		String authstr = "";
		for (String s : authors) authstr += s;
		return "Book [" + super.toString() + "] from" + authstr + ". \nAvailability: " + this.isAvailable();
	}

}
