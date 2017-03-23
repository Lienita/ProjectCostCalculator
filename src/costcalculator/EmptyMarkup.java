package costcalculator;
/**
 * <h1>EmptyMarkup</h1>
 * <p>
 * EmptyMarkup is an instantiable class that implements Markup interface.
 * It provides the implementation for the methods getName() and getPercent() specific to an Empty Markup.
 */
public class EmptyMarkup implements Markup{

	public String getName() {
		// the markup category name is Everything_else
		return "Everything_else";
	}

	public double getPercent() {
		// the Everything_else markup is 0
		return 0;
	}

}
