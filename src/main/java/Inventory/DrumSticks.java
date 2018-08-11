package Inventory;

import Interfaces.ISell;

public class DrumSticks extends Inventory implements ISell {
//    protected int costPrice;
//    protected int shopPrice;

    public DrumSticks(String manufacturer, int costPrice) {
        super(manufacturer, costPrice);
//        this.shopPrice = shopPrice;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getShopPrice() {
        return shopPrice;
    }
    public void addStock(ISell Instrument){
    }

    public void removeStock(){
    }

    @Override
    public int calculateMarkup() {
        return costPrice;
    }
}
