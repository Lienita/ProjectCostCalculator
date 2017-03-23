package costcalculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * <h1>DefaultCostCalculatorTest</h1>
 * <p>
 * DefaultCostCalculatorTest is an instantiable class that tests the 3 examples provided for NuPack's Pricing Problem through the method(s):
 * <p>
 * testCostCalculatorForExample1(), 
 *  <p>
 *  testCostCalculatorForExample2(),
 *  <p>
 *  testCostCalculatorForExample3(),
 *  <p>
 *  and testCostCalculatorWithoutMarkup().
 * <p> 
 */
public class DefaultCostCalculatorTest {

	/**
	 * <h1>testCostCalculatorForExample1</h1>
	 * <p>
	 * public void testCostCalculatorForExample1()
	 * <p>
	 * Tests the output of the CostCalculator for example 1 of NuPack's Pricing Problem.
	 * <p> 
	 * 		Input:  $1,299.99, 3 people, food
	 * <p>
     *		Output: $1,591.58
	 * <p> 
	 */
	@Test
	public void testCostCalculatorForExample1(){

		DefaultCostCalculator costCalculator = new DefaultCostCalculator();
		
		double projectCost = costCalculator.getProjectCost(1299.99, 3, "food");
		
		Assert.assertEquals(1591.58, projectCost, 0); 
	}
	
	/**
	 * <h1>testCostCalculatorForExample2</h1>
	 * <p>
	 * public void testCostCalculatorForExample2()
	 * <p>
	 * Tests the output of the CostCalculator for example 2 of NuPack's Pricing Problem.
	 * <p> 
	 * 		Input:  $5,432.00, 1 person, drugs
	 * <p>
     *		Output: $6,199.81
	 * <p> 
	 */
	@Test
	public void testCostCalculatorForExample2(){

		DefaultCostCalculator costCalculator = new DefaultCostCalculator();
		
		double projectCost = costCalculator.getProjectCost(5432.00, 1, "drugs");
		
		Assert.assertEquals(6199.81, projectCost, 0); 
	}

	/**
	 * <h1>testCostCalculatorForExample3</h1>
	 * <p>
	 * public void testCostCalculatorForExample3()
	 * <p>
	 * Tests the output of the CostCalculator for example 3 of NuPack's Pricing Problem.
	 * <p> 
	 * 		Input:  $12,456.95, 4 people, books
	 * <p>
     *		Output: $13,707.63
	 * <p> 
	 */
	@Test
	public void testCostCalculatorForExample3(){

		DefaultCostCalculator costCalculator = new DefaultCostCalculator();
		
		double projectCost = costCalculator.getProjectCost(12456.95, 4, "books");
		
		Assert.assertEquals(13707.63, projectCost, 0); 
	}

	/**
	 * <h1>testCostCalculatorWithoutMarkup</h1>
	 * <p>
	 * public void testCostCalculatorWithoutMarkup()
	 * <p>
	 * Tests the response of the Cost Calculator when a null markup argument is passed.
	 * <p> 
	 * 		Input:  $12,456.95, 4 people, books
	 * <p>
     *		Output: $13,707.63
	 * <p> 
	 */
	@Test (expected = CostCalculatorException.class)
	public void testCostCalculatorWithoutMarkup(){
		
		DefaultCostCalculator costCalculator = new DefaultCostCalculator();
		
		costCalculator.getProjectCost(55, 3, null);
		
		
	}
}
