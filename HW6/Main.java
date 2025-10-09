package HW6;

public class Main {
    public static void main(String[] args) {
        // Create Products
        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Phone", 800.0);
        Product p3 = new Product("Mouse", 50.0);
        Product p4 = new Product("Keyboard", 100.0);

        // Create Carts
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        // Add products to carts
        cart1.addProduct(p1);
        cart1.addProduct(p3);

        cart2.addProduct(p2);
        cart2.addProduct(p4);

        // Show cart contents and totals
        cart1.showcart();
        cart2.showcart();

        // Show total number of carts created
        Cart.printTotalCartNumber();

        // Demonstrate getter and setter
        System.out.println("Original Laptop price: $" + p1.getPrice());
        p1.setPrice(1000.0);
        System.out.println("Updated Laptop price: $" + p1.getPrice());
    }
}
