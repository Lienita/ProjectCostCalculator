package costcalculator;

import org.junit.Assert;
import org.junit.Test;


public class MarkupBuilderTest {

	@Test
	public void testBuildForFoodCase(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup foodMarkup = builder.buildMarkup("food");
		
		
		//Assert.assertTrue(foodMarkup instanceof FoodMarkup);
		Assert.assertEquals(FoodMarkup.class, foodMarkup.getClass());
	}

	@Test
	public void testBuildForWrongCase(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup foodMarkup = builder.buildMarkup("othercase");
		
		
		//Assert.assertTrue(foodMarkup instanceof FoodMarkup);
		Assert.assertEquals(EmptyMarkup.class, foodMarkup.getClass());
	}
}
