import Interfaces.IStockChange;

import java.util.ArrayList;

public class Shop {
    ArrayList<IStockChange> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<IStockChange> getStock() {
        return stock;
    }

    public void addStock(IStockChange inventoryOrInstrumentItem) {
        stock.add(inventoryOrInstrumentItem);
    }

    public void removeStock() {
        stock.remove(0);
    }
    //Not Required as not implementing IStockChange. This feels wrong.
    //Should move dependency to Shop, from Abstract Instrument and abstract Inventory.
//    public int calculateMarkup() {
//        System.out.println("Shop MarkUp");
//        return 0;
//    }

    public int checkProfitOfStock() {
        System.out.println(this.stock.size());
        // for number in numbers ^_^
        int profit = 0;
        for (IStockChange banana : stock) {
            profit += banana.calculateMarkup();
            System.out.println(profit);
        }
        return 0;
    }

}
