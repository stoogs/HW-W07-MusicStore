import Instruments.Instrument;
import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {
    ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
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
