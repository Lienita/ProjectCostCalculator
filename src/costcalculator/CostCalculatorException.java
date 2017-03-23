package costcalculator;

/**
 * <h1>CostCalculatorException</h1>
 * <p>
 * CostCalculatorException is a subclass of the superclass RuntimeException. 
 * It catches runtime exceptions thrown during the normal operation of the Java Virtual Machine. 
 */
public class CostCalculatorException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	

	protected CostCalculatorException(String message) {
		super(message);
	}


}
