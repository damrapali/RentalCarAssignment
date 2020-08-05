package validationJson;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest {
	
	@Test
	public void validatePrice() throws JsonProcessingException {
		Audi audi = new Audi();
		
		ObjectMapper mapper = new ObjectMapper();
		String result = mapper.writeValueAsString(audi);
		System.out.println(result);
		
	}
	

}
