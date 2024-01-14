package model;

public class InStoreOrder implements Order {
    private Product product;
    private int quantity;

    public InStoreOrder(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }
    @Override
    public double calculateTotalCost() {
        return product.getPrice()*quantity;
    }
}
