package pojo;

public class PerDayRent {
	
	int Price;
	int Discount;
	
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getDiscount() {
		return Discount;
	}
	public void setDiscount(int discount) {
		Discount = discount;
	}
	@Override
	public String toString() {
		return "PerDayRent [Price=" + Price + ", Discount=" + Discount + "]";
	}
	
	
}
