package costcalculator;
/**
 * <h1>FlatMarkup</h1>
 * <p>
 * FlatMarkup is an instantiable class that implements Markup interface.
 * It provides the implementation for the methods getName() and getPercent() specific to a Flat Markup.
 */
public class FlatMarkup implements Markup {

	public String getName() {
		// the markup category name is Flat
		return "Flat";
	}

	public double getPercent() {
		// the Flat markup is 5%. 
		// since the flat markup value will be used as the base value for further markup calculations, the 105% is conveniently returned.
		return 1.05;
	}

}
