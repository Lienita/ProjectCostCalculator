package costcalculator;

/**
 * <h1>DefaultCostCalculator</h1>
 * <p>
 * DefaultCostCalculator is an instantiable class that implements CostCalculator interface.
 * It provides the method body for the getProjectCost() method declared in the CostCalculator interface.
 * <p>
 */
public class DefaultCostCalculator implements CostCalculator {

	@Override
	public double getProjectCost(double basePrice, int peopleCount, String markup) {

		// Variable and Object declaration
		double flatMarkup, personMarkup, categoryTypeMarkup, finalCost;
		Markup flat = new FlatMarkup();
		Markup person = new PersonMarkup();

		// Checks for a null markup argument
		if(markup == null) {
			throw new CostCalculatorException("Markup is required");
		}
		
		// Defines the markup category to be used in the calculation
		Markup categoryType = new MarkupBuilder().buildMarkup(markup);
		
		// Checks for invalid negative arguments: base price and number of persons 
		if (basePrice < 0 || peopleCount < 0) {
            throw new IllegalArgumentException("The base price and number of people should not be less than 0");
        }

		// calculating the flat markup 
        flatMarkup = basePrice * flat.getPercent();
		// calculating the person markup 
        personMarkup = flatMarkup * peopleCount * person.getPercent();  
		// calculating the category type markup 
        categoryTypeMarkup = flatMarkup * categoryType.getPercent() ;
		// calculating the final cost of the project
        finalCost = flatMarkup + personMarkup + categoryTypeMarkup;

        // rounds the final cost to 2 decimal places
        return Math.round(finalCost * 100) / 100.00;
	}

}
