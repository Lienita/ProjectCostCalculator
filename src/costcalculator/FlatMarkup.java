package costcalculator;

public class FlatMarkup implements Markup {

	public String getName() {
		return "Flat";
	}

	public double getPercent() {
		return 1.05;
	}

}
