package costcalculator;

import org.junit.Assert;
import org.junit.Test;


public class DefaultCostCalculatorTest {

	@Test
	public void testCostCalculatorWithFoodMarkup(){
		DefaultCostCalculator costCalculator = new DefaultCostCalculator();
		
		double returnedValue = costCalculator.getProjectCost(55, 3, "food");
		
		Assert.assertEquals(45.0, returnedValue, 0); 
	}

	@Test (expected = CostCalulatorException.class)
	public void testCostCalculatorWithoutMarkup(){
		DefaultCostCalculator costCalculator = new DefaultCostCalculator();
		
		costCalculator.getProjectCost(55, 3, null);
		
	}
}
