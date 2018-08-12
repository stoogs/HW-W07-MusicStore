package Instruments;

import Interfaces.IPlay;
import Interfaces.IStockChange;

public class Guitar extends Instrument {
    private int numberOfStrings;

    public Guitar(String manufacturer, int costPrice, int numberOfStrings) {
        super(manufacturer, costPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Drrriiinnnngggg";
    }


}
