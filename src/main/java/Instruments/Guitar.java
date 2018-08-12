package Instruments;

import Interfaces.IPlay;
import Interfaces.IStockChange;

public class Guitar extends Instrument {
    private int numberOfStrings;

    public Guitar(InstrumentType type, String manufacturer, int costPrice, int numberOfStrings) {
        super(type, manufacturer, costPrice);
        this.numberOfStrings = numberOfStrings;
    }
// pre Enum.
    //    public Guitar(String manufacturer, int costPrice, int numberOfStrings) {
//        super(manufacturer, costPrice);
//        this.numberOfStrings = numberOfStrings;
//    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Drrriiinnnngggg";
    }
    @Override
    public int calculateMarkup() {
        System.out.println("Guitar Jimi Hendrix Used Markup ");
        return getCostPrice() * 100 - getCostPrice();
    }


}
