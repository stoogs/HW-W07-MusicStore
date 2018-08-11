package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Drums extends Instrument implements IPlay, ISell {
    private String kitSize;

    public Drums(String manufacturer, int costPrice, String kitSize) {
        super(manufacturer, costPrice);
        this.kitSize = kitSize;
    }

    public String getKitSize() {
        return kitSize;
    }

    public String play() {
        return "Bum-bum-da-boom";
    }

    public int calculateMarkup() {
        return getCostPrice() * 2;
    }

    //ISell promises
    public void addStock(ISell Instrument) { }
    public void removeStock() { }

}

