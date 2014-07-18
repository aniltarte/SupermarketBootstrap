public class ShoppingCart {
    private String productName;
    private int price;
    private int qty;

    public void add(String productName, int price, int qty) {
        this.productName = productName;
        this.price = price;
        this.qty = qty;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public int getTotalPrice() {
        return qty * price;
    }
}
