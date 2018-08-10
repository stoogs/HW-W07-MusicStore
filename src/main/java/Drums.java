import Interfaces.IPlay;

public class Drums extends Instrument implements IPlay {
    private String kitSize;

    public Drums(String manufacturer, int costPrice, String kitSize) {
        super(manufacturer, costPrice);
        this.kitSize = kitSize;
    }

    public String getKitSize() {
        return kitSize;
    }

    public String play(){
        return "Bum-bum-da-boom";
    }


}

