package assignment01;
public class SimpleDate {
	private int year;
	private int month;
	private int day;
	/*
	public SimpleDate(int yr, int mo,  int d) {
		this.yr = yr;
		this.mo = mo;
		this.day = d;
	}
	*/
	public boolean before(SimpleDate other) {
		if(this.year < other.year)
			return true;
		else if (this.year > other.year)
			return false;
		else if (this.month<other.month)
			return true;
		else if (this.month > other.month)
			return false;
		else if (this.day < other.day) 
			return true;
		return false;
	}
	@Override
	public String toString() {
		return String.format("%s/%s/%s", month, day, year);
	}
	public static SimpleDate of(int yr, int mo, int d) {
		SimpleDate returnVal = new SimpleDate();
		returnVal.year = yr;
		returnVal.month=mo;
		returnVal.day = d;
		return returnVal;
	}
}
