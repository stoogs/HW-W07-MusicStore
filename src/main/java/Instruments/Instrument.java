package Instruments;

import Interfaces.IPlay;
import Interfaces.IStockChange;
import Inventory.InventoryType;

import java.util.Collections;

public abstract class Instrument implements IPlay, IStockChange {
    private String manufacturer;
    private int costPrice;
    private int shopPrice;
    private InstrumentType type;

    public Instrument(InstrumentType type, String manufacturer, int costPrice) {
        this.manufacturer = manufacturer;
        this.costPrice = costPrice;
        this.type = type;
    }

    public boolean isOfType(InstrumentType it){
        return this.type == it;
    }

    public boolean isOfType(InventoryType it){
        return false;
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

    public InstrumentType getType() {
        return type;
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
