package Inventory;

import Interfaces.ISell;

public class GuitarStrings extends Inventory implements ISell {
//    protected int shopPrice;
//    protected int costPrice;

    public GuitarStrings(String manufacturer, int costPrice) {
        super(manufacturer, costPrice);
//        this.shopPrice = shopPrice;
    }

    @Override
    public int calculateMarkup() {
        return getCostPrice()*2;
    }
    //ISell promises
    public void addStock(ISell Instrument) { }
    public void removeStock() { }
}
