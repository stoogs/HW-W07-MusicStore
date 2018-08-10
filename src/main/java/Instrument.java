public class Instrument {
    private String manufacturer;
    private int costPrice;
    private double shopPrice;

    public Instrument(String manufacturer, int costPrice) {
        this.manufacturer = manufacturer;
        this.costPrice = costPrice;
        this.shopPrice = costPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public double getShopPrice() {
        return shopPrice;
    }
}
