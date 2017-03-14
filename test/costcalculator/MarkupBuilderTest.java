package costcalculator;

import org.junit.Assert;
import org.junit.Test;


public class MarkupBuilderTest {

	@Test
	public void testBuildForFoodCase(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup foodMarkup = builder.buildMarkup("food");
		
		
		Assert.assertEquals(FoodMarkup.class, foodMarkup.getClass());
	}
	
	@Test
	public void testBuildForSpecificFoodCase(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup foodMarkup = builder.buildMarkup("bread");
		
		
		Assert.assertEquals(FoodMarkup.class, foodMarkup.getClass());
	}

	@Test
	public void testBuildForWrongCase(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup foodMarkup = builder.buildMarkup("othercase");
				
		Assert.assertEquals(EmptyMarkup.class, foodMarkup.getClass());
	}

	@Test
	public void testBuildForPharmaceuticalCase1(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup pharmaceuticalsMarkup = builder.buildMarkup("antibiotic");
		
		
		Assert.assertEquals(PharmaceuticalsMarkup.class, pharmaceuticalsMarkup.getClass());
	}
	
	@Test
	public void testBuildForPharmaceuticalCase2(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup pharmaceuticalsMarkup = builder.buildMarkup("medicine");
		
		
		Assert.assertEquals(PharmaceuticalsMarkup.class, pharmaceuticalsMarkup.getClass());
	}
	
	@Test
	public void testBuildForElectronicCase1(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup electronicsMarkup = builder.buildMarkup("dvd");
		
		
		Assert.assertEquals(ElectronicsMarkup.class, electronicsMarkup.getClass());
	}
	
	@Test
	public void testBuildForElectronicCase2(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup electronicsMarkup = builder.buildMarkup("video game");
		
		
		Assert.assertEquals(ElectronicsMarkup.class, electronicsMarkup.getClass());
	}
	
	@Test
	public void testBuildForEverythingElseCase(){
		MarkupBuilder builder = new MarkupBuilder();
		Markup emptyMarkup = builder.buildMarkup("books");
				
		Assert.assertEquals(EmptyMarkup.class, emptyMarkup.getClass());
	}
}
