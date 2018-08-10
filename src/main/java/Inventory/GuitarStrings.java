package Inventory;

import Interfaces.ISell;

public class GuitarStrings{
    protected ISell costPrice;
    protected ISell shopPrice;

    public GuitarStrings(ISell costPrice, ISell shopPrice) {
        this.costPrice = costPrice;
        this.shopPrice = shopPrice;
    }

    public ISell getCostPrice() {
        return costPrice;
    }

    public ISell getShopPrice() {
        return shopPrice;
    }


}
