package ProjectShopOnline.model;

public class DeliveryOrder implements Order {
    private Product product;
    private int quantity;
    private double deliveryCostPercentage;

    public DeliveryOrder(Product product, int quantity, double deliveryCostPercentage) {
        this.product = product;
        this.quantity = quantity;
        this.deliveryCostPercentage = deliveryCostPercentage;
    }

    @Override
    public double calculateTotalCost() {
        double productCost = product.getPrice() * quantity;
        double deliveryCost = productCost * (deliveryCostPercentage / 100);
        return productCost * deliveryCost;
    }
}
