import Instruments.Instrument;
import Interfaces.ISell;
import Inventory.Inventory;

import java.util.ArrayList;

public class Shop {
    ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell instrument){
        stock.add(instrument);
    }

    public void removeStock() {
        stock.remove(0);
    }
}
