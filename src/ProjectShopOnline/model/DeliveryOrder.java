package ProjectShopOnline.model;

public class DeliveryOrder implements Order {
    private Product product;
    private int quantity;


    public DeliveryOrder(Product product, int quantity, double deliveryCostPercentage) {
        this.product = product;
        this.quantity = quantity;

    }

    @Override
    public double calculateTotalCost() {
        double productCost = product.getPrice() * quantity;
        double deliveryCost = productCost * 0.1;
        return productCost + deliveryCost;
    }
}
