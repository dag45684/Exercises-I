package inheritance;

public class Magazine extends Publish{
	
	private int month;
	private int day;
	private int number;
	
	public Magazine(int month, int day, int number, String name, int year, int code) {
		super(name, year, code);
		this.month=month;
		this.day=day;
		this.number=number;
	}

	public int getMonth() {return month;}

	public int getDay() {return day;}

	public int getNumber() {return number;}
	
	@Override
	public String toString() {
		return "Magazine [" + super.toString() + "] with number " + number + "at " + day + "/" + month;
	}

	@Override
	public int compareTo(Publish o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
