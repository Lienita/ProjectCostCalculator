package costcalculator;

/**
 * <h1>ElectronicsMarkup</h1>
 * <p>
 * ElectronicsMarkup is an instantiable class that implements Markup interface.
 * It provides the implementation for the methods getName() and getPercent() specific to an Electronic Markup.
 */
public class ElectronicsMarkup implements Markup{

	public String getName() {
		// the markup category name is Electronics
		return "Electronics";
	}

	public double getPercent() {	
		// the Electronics markup is 2%
		return 0.02;
	}

}
