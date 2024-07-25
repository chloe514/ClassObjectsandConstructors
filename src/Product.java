public class Product {
    private double productCost;
    private int quantity;
    private String productName;

    // Constructor
    public Product(double productCost, int quantity, String productName) {
        this.productCost = productCost;
        this.quantity = quantity;
        this.productName = productName;
    }

    // Method to calculate and print the total cost
    public void totalCost() {
        double total = productCost * quantity;
        System.out.println("Total cost is " + total);
    }

    // Method to print product details
    public void printProduct() {
        System.out.println(productName + " cost " + productCost + " and " + quantity + " units were purchased");
    }

    // Main method to test the Product class
    public static void main(String[] args) {
        // Instantiate a Product object
        Product product = new Product(4.0, 10, "Gallon of gas");

        // Print product details
        product.printProduct();

        // Print total cost
        product.totalCost();
    }
}


