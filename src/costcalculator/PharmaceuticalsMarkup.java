package costcalculator;
/**
 * <h1>PharmaceuticalsMarkup</h1>
 * <p>
 * PharmaceuticalsMarkup is an instantiable class that implements Markup interface.
 * It provides the implementation for the methods getName() and getPercent() specific to a Pharmaceutical Markup.
 */
public class PharmaceuticalsMarkup implements Markup{

	public String getName() {
		// the markup category name is Pharmaceuticals
		return "Pharmaceuticals";
	}

	public double getPercent() {
		// the Pharmaceuticals markup is 7.5%
		return 0.075;
	}

}
