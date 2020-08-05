package validationJson;



import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.path.json.JsonPath;
import pojo.Car;
import pojo.Metadata;
import pojo.Metrics;
import pojo.PerDayRent;
import pojo.RentalCount;

public class Audi {
	
	public static void main(String[] args) throws JsonProcessingException {
		
	
		Car audi = new Car();
		audi.setMake("audi");
		audi.setModel("A7");
		audi.setVin("09AGHY64352JITEG98K");
		
		Metadata audidata = new Metadata();
		audidata.setColor("Black");
		audidata.setNotes("Scratches on the front side of the car");
		audi.setMetadata(audidata);
		
		PerDayRent rent = new PerDayRent();
		rent.setDiscount(15);
		rent.setPrice(140);
		audi.setPerdayrent(rent);
		
		Metrics audiMetrics = new Metrics();
		audiMetrics.setDepreciation(2256.43);
		audiMetrics.setYoymaintenancecost(2190.76);
		audi.setMetrics(audiMetrics);
		
		RentalCount rentalCount = new RentalCount();
		rentalCount.setLastweek(4);
		rentalCount.setYeartodate(221);
		audiMetrics.setRentalcount(rentalCount);
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonResult = mapper.writeValueAsString(audi);
		System.out.println(jsonResult);
		
		Car mp = mapper.readValue(jsonResult, Car.class);	
		
		
	}

}
