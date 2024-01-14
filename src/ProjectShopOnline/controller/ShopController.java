package ProjectShopOnline.controller;


import ProjectShopOnline.model.Order;
import ProjectShopOnline.view.ShopView;

public class ShopController {
    private ShopView view;

    public ShopController(ShopView view){
        this.view = view;
    }
    public void processOrder(Order order){
        try {
            view.displayOrderDetails(order);
        }catch (Exception e){
            view.displayErrorMessage("Error processing order: "+ e.getMessage());
        }
    }
}
