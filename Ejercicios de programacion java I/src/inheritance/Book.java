package inheritance;

public class Book extends Rent{
	
	String author;
	
	public Book (String author, String title, int code, boolean available, int year) {
		super(title, code, year, available);
		this.author=author;
	}

	public String getAuthor() {return author;}

	@Override
	public String toString() {
		return "Book [" + super.toString() + "] from" + author + ". Availability: " + this.isAvailable();
	}

}
