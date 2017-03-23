package costcalculator;

/**
 * <h1>Markup</h1>
 * <p>
 * This interface defines a generic Markup. The interface Markup has the following method(s):
 * getName() and getPercent().
 * <p> 
 */
public interface Markup {

	/**
	 * <h1>getName</h1>
	 * <p>
	 * String getName()
	 * <p>
	 * Defines the Markup name.
	 * @return A string value that represents the Markup name.
	 * <p> 
	 */
	String getName();
	
	/**
	 * <h1>getPercent</h1>
	 * <p>
	 * double getPercent()
	 * <p>
	 * Defines the Markup percent. 
	 * @return A double value that represents the Markup percentage.
	 * <p> 
	 */
	
	// method signature
	double getPercent();
	
}
