package pojo;

public class Car {
	
	String make;
	String model;
	String vin;
	Metadata metadata;
	PerDayRent perdayrent;
	Metrics metrics;	
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public Metadata getMetadata() {
		return metadata;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
	public PerDayRent getPerdayrent() {
		return perdayrent;
	}
	public void setPerdayrent(PerDayRent perdayrent) {
		this.perdayrent = perdayrent;
	}
	public Metrics getMetrics() {
		return metrics;
	}
	public void setMetrics(Metrics metrics) {
		this.metrics = metrics;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", vin=" + vin + ", metadata=" + metadata + ", perdayrent="
				+ perdayrent + ", metrics=" + metrics + "]";
	}
	
	

}
