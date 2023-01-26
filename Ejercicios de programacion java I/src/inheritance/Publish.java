package inheritance;

public abstract class Publish { //abstract avoids the user from creating instances of this class.
	
	private String title;
	private int code;
	private int year;
	
	public Publish(String title, int code, int year) {
		this.title=title;
		this.code=code;
		this.year=year;
	}

	public String getTitle() {return title;}

	public int getCode() {return code;}

	public int getYear() {return year;}

	@Override
	public String toString() {
		return "title=" + title + ", code=" + code + ", year=" + year;
	}
	
	// public abstract void AbsMethod();
	// objects of this class will have to implement this method,
	// but doesnt restrain its characteristics or defines a
	// model to be overwritten. 
	// Exceptionally, abstract subclasses will be exempted of it
	
}
