package costcalculator;

/**
 * Cost calculator 
 *
 */
public interface CostCalculator {

	/**
	 * 
	 * @param basePrice
	 * @param peopleCount
	 * @param markup
	 * @return
	 */
	double getProjectCost(double basePrice, int peopleCount, String markup);
	
}
