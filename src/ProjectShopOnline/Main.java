package ProjectShopOnline;

import ProjectShopOnline.controller.ShopController;
import ProjectShopOnline.model.DeliveryOrderModel;
import ProjectShopOnline.model.InStoreOrderModel;
import ProjectShopOnline.model.Order;
import entity.Product;
import ProjectShopOnline.view.ConsoleShopView;
import ProjectShopOnline.view.ShopView;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 15000.0);


        ShopView consoleView = new ConsoleShopView();
        consoleView.displayWelcomeMessage();
        ShopController controller = new ShopController(consoleView);

        int inStoreQuantity = ((ConsoleShopView) consoleView).getInputQuantity();
        Order inStoreOrder = new InStoreOrderModel(laptop, inStoreQuantity);

        boolean deliveryOption = ((ConsoleShopView) consoleView).getDeliveryOption();
        Order deliveryOrder = new DeliveryOrderModel(laptop, 1, deliveryOption);

        controller.processOrder(inStoreOrder);
        controller.processOrder(deliveryOrder);
    }
}
