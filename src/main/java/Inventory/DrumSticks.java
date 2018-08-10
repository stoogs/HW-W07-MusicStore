package Inventory;

import Interfaces.ISell;
import Interfaces.IStock;

public class DrumSticks implements ISell, IStock {
    protected int costPrice;
    protected int shopPrice;

    public DrumSticks(int costPrice, int shopPrice) {
        this.costPrice = costPrice;
        this.shopPrice = shopPrice;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getShopPrice() {
        return shopPrice;
    }
    public void addStock(){

    }

    public void removeStock(){
    }

    @Override
    public int calculateMarkup() {
        return costPrice;
    }
}
