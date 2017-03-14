package costcalculator;

import java.util.Arrays;
import java.util.List;


public class MarkupBuilder {

	Markup buildMarkup(String label) {
		
    	List<String> pharmaceuticalProducts = Arrays.asList("drugs", "medicines", "medications", "antipyretics", "analgesics",
                "antibiotics", "antiseptics", "tranquilizers", "anesthetics", "antivirals", "anti-fungals", "anti-inflammatory",
                "anti-allergy", "decongestants", "vaccines", "electrolytes", "contraceptives", "anticoagulanst", "antibacterials");
    	List<String> foodProducts  = Arrays.asList("appetizers", "baked goods", "breads", "cereals", "condiments", "conveniences",
                "dairy", "desserts", "dips", "dried foods", "dumplings", "edible plants", "edible fungi", "edible nuts", "edible seeds",
                "eggs", "fast foods", "fermented foods", "halal foods", "kosher foods", "legumes", "meats", "noodles", "pastes", "pies", "salads",
                "sandwiches", "sauces", "seafoods", "snacks", "soups", "spreads", "staples", "stews");
    	List<String> electronicProducts = Arrays.asList("brown good", "television", "tv", "flatscreen", "camera", "digital camera",
                "pda", "calculator", "vcr", "dvd", "blue-ray", "clocks", "audio device", "headphone", "tablet", "smartphone", "e-reader",
                "e-book", "display device", "media receiver", "media player", "music player", "ipod", "mp3 player", "audio equipment",
                "music system", "karaoke", "telephone", "cell phone", "camcorders", "calculator", "laptop", "computer", "usb drive",
                "memory stick", "printer", "shredder", "remote control", "remote control car", "video game", "gaming system ",
                "nintendo", "playstation", "gps", "automotive electronic ,car stereo", "electronic musical instrument",
                "virtual reality head-mounted display goggle", "wearable technology", "fitbit ", "digital exercise watch",
                "digital watch", "parabolic antenna", "electronic toy", "white good", "washing machine", "drying machine ",
                "dishwasher", "microwave", "refrigerator", " smart home device", "domestic robot", "garage door opener", "vacuum cleaner");

    	
    	for (String pharmaList : pharmaceuticalProducts) {
            if (pharmaList.toLowerCase().contains(label.trim().toLowerCase())){
            	return new FoodMarkup();            	
            }
        }
        for (String foodList : foodProducts) {
            if (foodList.toLowerCase().contains(label.trim().toLowerCase())){
            	return new FoodMarkup();
            }
        }
        for (String elctronicList : electronicProducts) {
            if (elctronicList.toLowerCase().contains(label.trim().toLowerCase())){
            	return new ElectronicsMarkup();
            }
        }
        //if (type == null)
        return new EmptyMarkup();
	
	}
	
}
