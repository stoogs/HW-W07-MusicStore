import Interfaces.IStockChange;

import java.util.ArrayList;

public class Shop implements IStockChange {
    ArrayList<IStockChange> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<IStockChange> getStock() {
        return stock;
    }

    public void addStock(IStockChange inventoryOrInstrumentItem){
        stock.add(inventoryOrInstrumentItem);
    }

    public void removeStock() {
        stock.remove(0);
    }
    public int calculateMarkup(){
        return 0;
    }

}
