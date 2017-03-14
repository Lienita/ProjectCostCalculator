package costcalculator;

import org.junit.Assert;
import org.junit.Test;


public class DefaultCostCalculatorTest {

	@Test
	public void testCostCalculatorForExample1(){
		DefaultCostCalculator costCalculator = new DefaultCostCalculator();
		
		double returnedValue = costCalculator.getProjectCost(1299.99, 3, "food");
		
		Assert.assertEquals(1591.58, returnedValue, 0); 
	}
	
	@Test
	public void testCostCalculatorForExample2(){
		DefaultCostCalculator costCalculator = new DefaultCostCalculator();
		
		double returnedValue = costCalculator.getProjectCost(5432.00, 1, "drugs");
		
		Assert.assertEquals(6199.81, returnedValue, 0); 
	}

	@Test
	public void testCostCalculatorForExample3(){
		DefaultCostCalculator costCalculator = new DefaultCostCalculator();
		
		double returnedValue = costCalculator.getProjectCost(12456.95, 4, "books");
		
		Assert.assertEquals(13707.63, returnedValue, 0); 
	}

	@Test (expected = CostCalculatorException.class)
	public void testCostCalculatorWithoutMarkup(){
		DefaultCostCalculator costCalculator = new DefaultCostCalculator();
		
		costCalculator.getProjectCost(55, 3, null);
		
	}
}
