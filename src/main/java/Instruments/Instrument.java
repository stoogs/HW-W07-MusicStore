package Instruments;

import Interfaces.IPlay;
import Interfaces.IStockChange;

public abstract class Instrument implements IPlay, IStockChange {
    private String manufacturer;
    private int costPrice;
    private int shopPrice;

    public Instrument(String manufacturer, int costPrice) {
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
        System.out.println("Instrument Abstract Class");
        return getCostPrice() * 2 - getCostPrice();
    }

    //IStockChange promises
    public void addStock(IStockChange Instrument) {
    }

    public void removeStock() {
    }
}
