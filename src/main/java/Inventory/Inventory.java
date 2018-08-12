package Inventory;

import Interfaces.IStockChange;

public abstract class Inventory implements IStockChange {
    protected String manufacturer;
    protected int costPrice;
    protected int shopPrice;

    public Inventory(String manufacturer, int costPrice) {
        this.manufacturer = manufacturer;
        this.costPrice = costPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getShopPrice() {
        return shopPrice;
    }

    public int calculateMarkup() {
        System.out.println("Inventory Abstract Class");
        return getCostPrice() * 2 - getCostPrice();
    }

    //IStockChange promises
    public void addStock(IStockChange instrument) {
    }

    public void removeStock() {
    }
}
