package ProjectShopOnline.model;

public interface ShopView {
    void displayOrderDetails(Order order);
    void displayErrorMessage(String message);
}
