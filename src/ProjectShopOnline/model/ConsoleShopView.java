package ProjectShopOnline.model;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsoleShopView implements ShopView {
    private DecimalFormat df = new DecimalFormat("#.##");
    private Scanner scanner;

    public ConsoleShopView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void displayOrderDetails(Order order) {
        System.out.println("Order details:");
        System.out.println("Total cost: $" + df.format(order.calculateTotalCost()));
        System.out.println("----------------------");

    }

    @Override
    public void displayErrorMessage(String message) {
        System.out.println("Error " + message);

    }
    public int getInputQuantity(){
        System.out.println("Enter quantity: ");
        return scanner.nextInt();
    }
}
