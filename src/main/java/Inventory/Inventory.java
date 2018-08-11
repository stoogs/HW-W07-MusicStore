package Inventory;

    public abstract class Inventory{
        protected String manufacturer;
        protected int costPrice;
        protected int shopPrice;

        public Inventory(String manufacturer, int costPrice) {
            this.manufacturer = manufacturer;
            this.costPrice = costPrice;
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
