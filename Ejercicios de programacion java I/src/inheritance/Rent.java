package inheritance;

public class Rent extends Publish{
	
	private boolean available;
	
	public Rent (String title, int code, int year, boolean available) {
		super(title, code, year);
		this.available=available;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
}
