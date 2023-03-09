package inheritance;

import java.util.Objects;

//Comparable implements an anstract method that has to be declared either here or in all sub-classes that implement this one
public abstract class Publish implements Comparable<Publish> { //abstract avoids the user from creating instances of this class.
	
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publish other = (Publish) obj;
		return code == other.code && Objects.equals(title, other.title) && year == other.year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, title, year);
	}

	

	
	// public abstract void AbsMethod();
	// objects of this class will have to implement this method,
	// but doesnt restrain its characteristics or defines a
	// model to be overwritten. 
	// Exceptionally, abstract subclasses will be exempted of it
	
	
	
}
