package Inventory;

import Instruments.InstrumentType;
import Interfaces.IStockChange;

public abstract class Inventory implements IStockChange {
    private InventoryType type;
    private String manufacturer;
    private int costPrice;
    private int shopPrice;

    public Inventory(InventoryType type,  String manufacturer, int costPrice) {
        this.manufacturer = manufacturer;
        this.costPrice = costPrice;
    }

    public boolean isOfType(InstrumentType it){
        return false;
    }

    public boolean isOfType(InventoryType it){
        return this.type == it;
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
