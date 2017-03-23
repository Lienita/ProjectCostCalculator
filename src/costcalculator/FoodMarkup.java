package costcalculator;
/**
 * <h1>FoodMarkup</h1>
 * <p>
 * FoodMarkup is an instantiable class that implements Markup interface.
 * It provides the implementation for the methods getName() and getPercent() specific to a Food Markup.
 */
public class FoodMarkup implements Markup {

	public String getName() {
		// the markup category name is Food
		return "Food";
	}

	public double getPercent() {
		// the Food markup is 13%
		return 0.13;
	}

}
