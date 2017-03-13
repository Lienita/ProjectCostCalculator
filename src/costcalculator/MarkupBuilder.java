package costcalculator;

public class MarkupBuilder {

	Markup buildMarkup(String label) {
		
		if ("Pharmaceutical".equalsIgnoreCase(label)){
			return new FoodMarkup();
		}else if ("Food".equalsIgnoreCase(label)){
			return new PharmaceuticalsMarkup();
		}else if ("Electronics".equalsIgnoreCase(label)){
			return new ElectronicsMarkup();
		}else
			return new EmptyMarkup();		
	}
	
}
