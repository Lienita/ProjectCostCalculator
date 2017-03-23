package costcalculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * <h1>FlatMarkupTest</h1>
 * <p>
 * FlatMarkupTest is an instantiable class that tests the calculation of the Flat Markup for the 3 examples provided for NuPack's Pricing Problem.
 * It performs those tests through the method(s):
 * <p>
 * testFlatMarkupForExample1(), 
 *  <p>
 *  testFlatMarkupForExample2(),
 *  <p>
 *  and testFlatMarkupForExample3()
 * <p> 
 */
public class FlatMarkupTest {
	
	/**
	 * <h1>testFlatMarkupForExample1</h1>
	 * <p>
	 * public void testFlatMarkupForExample1()
	 * <p>
	 * Tests the output of the Flat Markup for example 1 of NuPack's Pricing Problem.
	 * <p> 
	 * 		Input:  $1,299.99
	 * <p>
     *		Output: $1,364.99
	 * <p> 
	 */
	@Test
	public void testFlatMarkupForExample1(){
		FlatMarkup flat = new FlatMarkup();
		
		double flatMarkupValue = Math.round(1299.99 * flat.getPercent()*100.00)/100.00;
		
		Assert.assertEquals(1364.99, flatMarkupValue, 0); 
	}
	
	/**
	 * <h1>testFlatMarkupForExample2</h1>
	 * <p>
	 * public void testFlatMarkupForExample2()
	 * <p>
	 * Tests the output of the Flat Markup for example 2 of NuPack's Pricing Problem.
	 * <p> 
	 * 		Input:  $5,432.00
	 * <p>
     *		Output: $5,703.60
	 * <p> 
	 */
	@Test
	public void testFlatMarkupForExample2(){
		FlatMarkup flat = new FlatMarkup();
		
		double flatMarkupValue = Math.round(5432.00 * flat.getPercent()*100.00)/100.00;
		
		Assert.assertEquals(5703.60, flatMarkupValue, 0); 
		
	}
	
	/**
	 * <h1>testFlatMarkupForExample3</h1>
	 * <p>
	 * public void testFlatMarkupForExample3()
	 * <p>
	 * Tests the output of the Flat Markup for example 3 of NuPack's Pricing Problem.
	 * <p> 
	 * 		Input:  $12,456.95
	 * <p>
     *		Output: $13,079.80
	 * <p> 
	 */
	@Test
	public void testFlatMarkupForExample3(){
		FlatMarkup flat = new FlatMarkup();
		
		double flatMarkupValue = Math.round(12456.95 * flat.getPercent()*100.00)/100.00;
		
		Assert.assertEquals(13079.80, flatMarkupValue, 0); 
	}

}
