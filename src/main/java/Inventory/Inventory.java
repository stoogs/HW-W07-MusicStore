package Inventory;

    public class Inventory{
        private String manufacturer;
        private int costPrice;
        private int shopPrice;

        public Inventory(String manufacturer, int costPrice) {
            this.manufacturer = manufacturer;
            this.costPrice = costPrice;
            this.shopPrice = shopPrice;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public int getCostPrice() {
            return costPrice;
        }

        public int getShopPrice() {
            return shopPrice;
        }
}
