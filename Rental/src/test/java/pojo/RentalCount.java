package pojo;

public class RentalCount {
	
	int lastweek;
	int yeartodate;
	
	public int getLastweek() {
		return lastweek;
	}
	public void setLastweek(int lastweek) {
		this.lastweek = lastweek;
	}
	public int getYeartodate() {
		return yeartodate;
	}
	public void setYeartodate(int yeartodate) {
		this.yeartodate = yeartodate;
	}
	@Override
	public String toString() {
		return "RentalCount [lastweek=" + lastweek + ", yeartodate=" + yeartodate + "]";
	}
	
	

}
