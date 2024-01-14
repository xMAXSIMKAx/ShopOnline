package ProjectShopOnline.model;

import entity.Product;

public class DeliveryOrderModel implements Order {
    private Product product;
    private int quantity;
    private boolean deliveryOption;

    public DeliveryOrderModel(Product product, int quantity, boolean deliveryOption) {
        this.product = product;
        this.quantity = quantity;
        this.deliveryOption = deliveryOption;
    }

    @Override
    public double calculateTotalCost() {
        double productCost = product.getPrice() * quantity;
        double deliveryCost = deliveryOption ? productCost * 0.1 : 0; // 10% від суми замовлення, якщо доставка вибрана, інакше - 0
        return productCost + deliveryCost;
    }

    public double calculateDeliveryCost() {
        return deliveryOption ? product.getPrice() * quantity * 0.1 : 0;
    }
}