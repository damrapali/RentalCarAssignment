package pojo;

public class Metrics {
	
	double yoymaintenancecost;
	double depreciation;
	RentalCount rentalcount;
	
	public double getYoymaintenancecost() {
		return yoymaintenancecost;
	}
	public void setYoymaintenancecost(double yoymaintenancecost) {
		this.yoymaintenancecost = yoymaintenancecost;
	}
	public double getDepreciation() {
		return depreciation;
	}
	public void setDepreciation(double depreciation) {
		this.depreciation = depreciation;
	}
	public RentalCount getRentalcount() {
		return rentalcount;
	}
	public void setRentalcount(RentalCount rentalcount) {
		this.rentalcount = rentalcount;
	}
	@Override
	public String toString() {
		return "Metrics [yoymaintenancecost=" + yoymaintenancecost + ", depreciation=" + depreciation + ", rentalcount="
				+ rentalcount + "]";
	}

	
}
