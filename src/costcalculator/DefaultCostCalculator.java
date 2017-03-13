package costcalculator;

public class DefaultCostCalculator implements CostCalculator {

	@Override
	public double getProjectCost(double basePrice, int peopleCount, String markup) {

		double flatMarkup, personMarkup, materialTypeMarkup, finalCost;
		Markup flat = new FlatMarkup();
		Markup person = new PersonMarkup();
		Markup materialType = new MarkupBuilder().buildMarkup(markup);
        
		
		if(markup == null) {
			throw new CostCalulatorException("Markup is required");
		}
		
		if (basePrice < 0 || peopleCount < 0) {
            throw new IllegalArgumentException("The base price and number of people should not be less than 0");
        }

        flatMarkup = basePrice * flat.getPercent();
        personMarkup = flatMarkup * peopleCount * person.getPercent();  
        materialTypeMarkup = flatMarkup * materialType.getPercent() ;
        finalCost = flatMarkup + personMarkup + materialTypeMarkup;

        return Math.round(finalCost * 100) / 100.00;
	}

}
