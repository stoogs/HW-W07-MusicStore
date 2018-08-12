package Instruments;

import Interfaces.IPlay;
import Interfaces.IStockChange;

public class Drums extends Instrument {
    private String kitSize;
//    private InstrumentType type;

    public Drums(InstrumentType type, String manufacturer, int costPrice, String kitSize) {
        super(type, manufacturer, costPrice);
        this.kitSize = kitSize;
//        this.type = type;
    }

    //    public Drums(String manufacturer, int costPrice, String kitSize) {
//        super(manufacturer, costPrice);
//        this.kitSize = kitSize;
//    }

    public String getKitSize() {
        return kitSize;
    }

    public String play() {
        return "Bum-bum-da-boom";
    }

}

