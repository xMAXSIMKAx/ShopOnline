package ProjectShopOnline.view;

import ProjectShopOnline.model.Order;

public interface ShopView {
    void displayOrderDetails(Order order);
    void displayErrorMessage(String message);
}
