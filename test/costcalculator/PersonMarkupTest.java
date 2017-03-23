package costcalculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * <h1>PersonMarkupTest</h1>
 * <p>
 * PersonMarkupTest is an instantiable class that tests the calculation of the Person Markup for the 3 examples provided for NuPack's Pricing Problem.
 * It performs those tests through the method(s):
 * <p>
 * testPersonMarkupForExample1(), 
 * <p>
 * testPersonMarkupForExample2(),
 *  <p>
 * and testPersonMarkupForExample3()
 * <p> 
 */
public class PersonMarkupTest {
	
	/**
	 * <h1>testPersonMarkupForExample1</h1>
	 * <p>
	 * public void testPersonMarkupForExample1()
	 * <p>
	 * Tests the output of the Person Markup for example 1 of NuPack's Pricing Problem.
	 * <p> 
	 * 		Input:  $1,299.99, 3 people
	 * <p>
     *		Output: $49.14
	 * <p> 
	 */
	@Test
	public void testPersonMarkupForExample1(){
		FlatMarkup flat = new FlatMarkup();
		PersonMarkup person = new PersonMarkup();
		double flatMarkup = 1299.99 * flat.getPercent();
		
		double personMarkupValue = Math.round(flatMarkup * person.getPercent() * 3* 100.00)/100.00;
		
		Assert.assertEquals(49.14, personMarkupValue, 0); 
	}
	
	/**
	 * <h1>testPersonMarkupForExample2</h1>
	 * <p>
	 * public void testPersonMarkupForExample2()
	 * <p>
	 * Tests the output of the Person Markup for example 2 of NuPack's Pricing Problem.
	 * <p> 
	 * 		Input:  $5,432.00, 1 person
	 * <p>
     *		Output: $68.44
	 * <p> 
	 */
	@Test
	public void testPersonMarkupForExample2(){
		FlatMarkup flat = new FlatMarkup();
		PersonMarkup person = new PersonMarkup();
		double flatMarkup = 5432.00 * flat.getPercent();
		
		double personMarkupValue = Math.round(flatMarkup * person.getPercent() * 1* 100.00)/100.00;
		
		Assert.assertEquals(68.44, personMarkupValue, 0); 
	}
	
	/**
	 * <h1>testPersonMarkupForExample3</h1>
	 * <p>
	 * public void testPersonMarkupForExample3()
	 * <p>
	 * Tests the output of the Person Markup for example 3 of NuPack's Pricing Problem.
	 * <p> 
	 * 		Input:  $12,456.95, 4 people
	 * <p>
     *		Output: $627.83
	 * <p> 
	 */
	@Test
	public void testPersonMarkupForExample3(){
		FlatMarkup flat = new FlatMarkup();
		PersonMarkup person = new PersonMarkup();
		double flatMarkup = 12456.95 * flat.getPercent();
		
		double personMarkupValue = Math.round(flatMarkup * person.getPercent() * 4* 100.00)/100.00;
		
		Assert.assertEquals(627.83, personMarkupValue, 0); 
	}

}
