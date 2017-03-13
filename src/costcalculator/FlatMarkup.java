package costcalculator;

public class FlatMarkup implements Markup {

	public String getName() {
		return "Flat";
	}

	public double getPercent() {
		return 0.05;
	}

}
