package ProjectShopOnline.view;

import ProjectShopOnline.model.DeliveryOrder;
import ProjectShopOnline.model.Order;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsoleShopView implements ShopView {
    private DecimalFormat df = new DecimalFormat("#.##");
    private Scanner scanner;

    public ConsoleShopView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void displayWelcomeMessage() {
        System.out.println("Welcome to the Online Shop TechnicWorld\n");

    }

    @Override
    public void displayOrderDetails(Order order) {
        System.out.println("Order Details:");
        if (order instanceof DeliveryOrder) {
            double productCost = order.calculateTotalCost() - ((DeliveryOrder) order).calculateDeliveryCost();
            System.out.println("Product Cost: $" + df.format(productCost));
            System.out.println("Delivery Cost: $" + df.format(((DeliveryOrder) order).calculateDeliveryCost()));
        } else {
            System.out.println("Total Cost: $" + df.format(order.calculateTotalCost()));
        }
        System.out.println("=====================");
    }


    public int getInputQuantity() {
        System.out.print("Enter quantity: ");
        return scanner.nextInt();
    }

    public boolean getDeliveryOption() {
        System.out.print("Do you want delivery? (true/false): ");
        return scanner.nextBoolean();
    }
}