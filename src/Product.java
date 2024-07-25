
public class Product {
    private double cost;
    private int quantity;
    private String name;

    // Constructor
    public Product(String name, double cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    // Method to print total cost
    public void totalCost() {
        double total = cost * quantity;
        System.out.println("Total cost for " + quantity + " units of " + name + ": $" + total);
    }

    // Method to print product details
    public void printProduct() {
        System.out.println("Product: " + name);
        System.out.println("Cost per unit: $" + cost);
        System.out.println("Quantity: " + quantity);
    }
}



