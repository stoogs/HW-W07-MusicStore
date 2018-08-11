package Interfaces;

import Inventory.Inventory;

public interface ISell {
    int calculateMarkup();
    //TODO look here.
    void  addStock(ISell banana);
    void removeStock();
}
