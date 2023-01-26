package inheritance;

public class Publish {
	
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
	
}
