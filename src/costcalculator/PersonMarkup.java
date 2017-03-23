package costcalculator;
/**
 * <h1>PersonMarkup</h1>
 * <p>
 * PersonMarkup is an instantiable class that implements Markup interface.
 * It provides the implementation for the methods getName() and getPercent() specific to a Person Markup.
 */
public class PersonMarkup implements Markup{

	public String getName() {
		// the markup category name is Person
		return "Person";
	}

	public double getPercent() {
		// the Person markup is 12%
		return 0.012;
	}

}
