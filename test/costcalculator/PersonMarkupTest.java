package costcalculator;

import org.junit.Assert;
import org.junit.Test;

public class PersonMarkupTest {
	
	@Test
	public void testPersonMarkupForExample1(){
		FlatMarkup flat = new FlatMarkup();
		PersonMarkup person = new PersonMarkup();
		double flatMarkup = 1299.99 * flat.getPercent();
		
		double returnedValue = Math.round(flatMarkup * person.getPercent() * 3* 100.00)/100.00;
		
		Assert.assertEquals(49.14, returnedValue, 0); 
	}
	
	@Test
	public void testPersonMarkupForExample2(){
		FlatMarkup flat = new FlatMarkup();
		PersonMarkup person = new PersonMarkup();
		double flatMarkup = 5432.00 * flat.getPercent();
		
		double returnedValue = Math.round(flatMarkup * person.getPercent() * 1* 100.00)/100.00;
		
		Assert.assertEquals(68.44, returnedValue, 0); 
	}
	
	@Test
	public void testPersonMarkupForExample3(){
		FlatMarkup flat = new FlatMarkup();
		PersonMarkup person = new PersonMarkup();
		double flatMarkup = 12456.95 * flat.getPercent();
		
		double returnedValue = Math.round(flatMarkup * person.getPercent() * 4* 100.00)/100.00;
		
		Assert.assertEquals(627.83, returnedValue, 0); 
	}

}
