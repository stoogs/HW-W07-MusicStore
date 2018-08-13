package Interfaces;

import Instruments.InstrumentType;
import Inventory.InventoryType;

public interface IStockChange {

    int calculateMarkup();
    boolean isOfType(InstrumentType it);
    boolean isOfType(InventoryType it);
//    void addStock(IStockChange banana);
//    void removeStock();
}
