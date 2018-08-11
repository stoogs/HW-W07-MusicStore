import Interfaces.ISell;

import java.util.ArrayList;

public class Shop implements ISell {
    ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStock(ISell inventoryOrInstrument){
        stock.add(inventoryOrInstrument);
    }

    public void removeStock() {
        stock.remove(0);
    }
    public int calculateMarkup(){
        return 0;
    }

}
