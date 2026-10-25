
public class ShoppingCalculator {
    public static void main(String[] args) {
        int quantity = 3;
        double unitPrice = 49.99;
        String storeName = "SM Manila Store";

        // Use double because totalCost may contain decimal values.
        // Using int would lose the cents in the total.
        double totalCost = quantity * unitPrice;

        System.out.println("===== Shopping Summary =====");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Unit Price: ₱%.2f%n", unitPrice);
        System.out.printf("Total Cost: ₱%.2f%n", totalCost);
    }
}
