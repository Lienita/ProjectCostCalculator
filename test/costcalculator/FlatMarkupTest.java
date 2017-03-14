package costcalculator;

import org.junit.Assert;
import org.junit.Test;

public class FlatMarkupTest {
	
	@Test
	public void testFlatMarkupForExample1(){
		FlatMarkup flat = new FlatMarkup();
		
		double returnedValue = Math.round(1299.99 * flat.getPercent()*100.00)/100.00;
		
		Assert.assertEquals(1364.99, returnedValue, 0); 
	}
	
	@Test
	public void testFlatMarkupForExample2(){
		FlatMarkup flat = new FlatMarkup();
		
		double returnedValue = Math.round(5432.00 * flat.getPercent()*100.00)/100.00;
		
		Assert.assertEquals(5703.60, returnedValue, 0); 
		
	}
	
	@Test
	public void testFlatMarkupForExample3(){
		FlatMarkup flat = new FlatMarkup();
		
		double returnedValue = Math.round(12456.95 * flat.getPercent()*100.00)/100.00;
		
		Assert.assertEquals(13079.80, returnedValue, 0); 
	}

}
