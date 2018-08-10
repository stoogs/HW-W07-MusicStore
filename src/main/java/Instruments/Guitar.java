package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Guitar extends Instrument implements IPlay,ISell {
    private int numberOfStrings;

    public Guitar(String manufacturer, int costPrice, int numberOfStrings) {
        super(manufacturer, costPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Drrriiinnnngggg";
    }

    public int calculateMarkup(){
        return 0;
    }



}
