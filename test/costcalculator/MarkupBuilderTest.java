package costcalculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * <h1>MarkupBuilderTest</h1>
 * <p>
 * MarkupBuilderTest is an instantiable class that tests the markup category output of the MarkupBuilder() method in the MarkupBuilder Class.
 * It performs those tests through the method(s):
 * <p>
 * testBuildForFoodCase(), 
 * <p>
 * testBuildForSpecificFoodCase(),
 * <p>
 * testBuildForWrongCase(),
 * <p>
 * testBuildForPharmaceuticalCase1(),
 * <p>
 * testBuildForPharmaceuticalCase2(),
 * <p>
 * testBuildForElectronicCase1(),
 * <p>
 * testBuildForElectronicCase2(),
 * <p>
 * and testBuildForEverythingElseCase()
 * <p> 
 */
public class MarkupBuilderTest {
	
	/**
	 * <h1>testBuildForFoodCase</h1>
	 * <p>
	 * public void testBuildForFoodCase()
	 * <p>
	 * Tests the output of the MarkupBuilder() method in the MarkupBuilder Class for example 1 of NuPack's Pricing Problem.
	 * <p> 
	 * 		Input:  food
	 * <p>
     *		Output: food Markup
	 * <p> 
	 */
	@Test
	public void testBuildForFoodCase(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup foodMarkup = builder.buildMarkup("food");
		
		
		Assert.assertEquals(FoodMarkup.class, foodMarkup.getClass());
	}
	
	/**
	 * <h1>testBuildForSpecificFoodCase</h1>
	 * <p>
	 * public void testBuildForSpecificFoodCase()
	 * <p>
	 * Tests the output of the MarkupBuilder() method in the MarkupBuilder Class.
	 * <p> 
	 * 		Input:  bread
	 * <p>
     *		Output: food Markup
	 * <p> 
	 */
	@Test
	public void testBuildForSpecificFoodCase(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup foodMarkup = builder.buildMarkup("bread");
		
		
		Assert.assertEquals(FoodMarkup.class, foodMarkup.getClass());
	}

	/**
	 * <h1>testBuildForWrongCase</h1>
	 * <p>
	 * public void testBuildForWrongCase()
	 * <p>
	 * Tests the output of the MarkupBuilder() method in the MarkupBuilder Class.
	 * <p> 
	 * 		Input:  othercase
	 * <p>
     *		Output: Empty Markup 
	 * <p> 
	 */
	@Test
	public void testBuildForWrongCase(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup foodMarkup = builder.buildMarkup("othercase");
				
		Assert.assertEquals(EmptyMarkup.class, foodMarkup.getClass());
	}

	/**
	 * <h1>testBuildForPharmaceuticalCase1</h1>
	 * <p>
	 * public void testBuildForPharmaceuticalCase1()
	 * <p>
	 * Tests the output of the MarkupBuilder() method in the MarkupBuilder Class.
	 * <p> 
	 * 		Input:  antibiotic
	 * <p>
     *		Output: Pharmaceuticals Markup 
	 * <p> 
	 */
	@Test
	public void testBuildForPharmaceuticalCase1(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup pharmaceuticalsMarkup = builder.buildMarkup("antibiotic");
		
		
		Assert.assertEquals(PharmaceuticalsMarkup.class, pharmaceuticalsMarkup.getClass());
	}
	
	/**
	 * <h1>testBuildForPharmaceuticalCase2</h1>
	 * <p>
	 * public void testBuildForPharmaceuticalCase2()
	 * <p>
	 * Tests the output of the MarkupBuilder() method in the MarkupBuilder Class.
	 * <p> 
	 * 		Input:  medicine
	 * <p>
     *		Output: Pharmaceuticals Markup 
	 * <p> 
	 */
	@Test
	public void testBuildForPharmaceuticalCase2(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup pharmaceuticalsMarkup = builder.buildMarkup("medicine");
		
		
		Assert.assertEquals(PharmaceuticalsMarkup.class, pharmaceuticalsMarkup.getClass());
	}
	
	/**
	 * <h1>testBuildForElectronicCase1</h1>
	 * <p>
	 * public void testBuildForElectronicCase1()
	 * <p>
	 * Tests the output of the MarkupBuilder() method in the MarkupBuilder Class.
	 * <p> 
	 * 		Input:  dvd
	 * <p>
     *		Output: Electronics Markup 
	 * <p> 
	 */
	@Test
	public void testBuildForElectronicCase1(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup electronicsMarkup = builder.buildMarkup("dvd");
		
		
		Assert.assertEquals(ElectronicsMarkup.class, electronicsMarkup.getClass());
	}
	
	/**
	 * <h1>testBuildForElectronicCase2</h1>
	 * <p>
	 * public void testBuildForElectronicCase2()
	 * <p>
	 * Tests the output of the MarkupBuilder() method in the MarkupBuilder Class.
	 * <p> 
	 * 		Input:  video game
	 * <p>
     *		Output: Electronics Markup 
	 * <p> 
	 */
	@Test
	public void testBuildForElectronicCase2(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup electronicsMarkup = builder.buildMarkup("video game");
		
		
		Assert.assertEquals(ElectronicsMarkup.class, electronicsMarkup.getClass());
	}
	
	/**
	 * <h1>testBuildForEverythingElseCase</h1>
	 * <p>
	 * public void testBuildForEverythingElseCase()
	 * <p>
	 * Tests the output of the MarkupBuilder() method in the MarkupBuilder Class for example 3 of NuPack's Pricing Problem.
	 * <p> 
	 * 		Input:  books
	 * <p>
     *		Output: Empty Markup 
	 * <p> 
	 */
	@Test
	public void testBuildForEverythingElseCase(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup emptyMarkup = builder.buildMarkup("books");
				
		Assert.assertEquals(EmptyMarkup.class, emptyMarkup.getClass());
	}
}
