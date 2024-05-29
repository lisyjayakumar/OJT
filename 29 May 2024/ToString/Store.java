
public class Store {

    // instance fields
    public String productType;
    public double price;

    // constructor method
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    public String toString() {
        return "This store sells " + productType + " at a price of " + price + ".";

    }

}
