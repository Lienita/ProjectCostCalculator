package costcalculator;

/**
 * <h1>CostCalculator</h1>
 * <p>
 * This interface defines a generic Cost Calculator for NuPack's Pricing Problem. The interface CostCalculator has the following method(s): getProjectCost().
 * <p> 
 */
public interface CostCalculator {

	/**
	 * <h1>getProjectCost</h1>
	 * <p>
	 * public double getProjectCost(double basePrice, int peopleCount, String markup)
	 * <p>
	 * This method is used to calculate the final cost of NuPack's Pricing Problem
	 * <p>
	 * @param basePrice - a double value representing the base price 
	 * @param peopleCount - a positive integer greater than 0 representing the amount of people performing the project
	 * @param markup - a String value that represents the product type involved in the project
	 * <p>
	 * @return A double value that represents the final project cost of NuPack's Pricing Problem.
	 * <p>
	 */
	
	// method signature
	double getProjectCost(double basePrice, int peopleCount, String markup);
	
}
