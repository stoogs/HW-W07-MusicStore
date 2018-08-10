package Inventory;

import Interfaces.ISell;
import Interfaces.IStock;

public class GuitarStrings extends Inventory implements ISell, IStock {

    public GuitarStrings(String manufacturer, int costPrice) {
        super(manufacturer, costPrice);
    }

    public void addStock(){

    }

    public void removeStock(){

    }

    @Override
    public int calculateMarkup() {
        return 0;
    }
}
