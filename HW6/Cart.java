package HW6;

public class Cart {
    private Product[] products = new Product[5];
    private int count = 0;
    private static int totalcartnumber = 0;

    public Cart() {
        totalcartnumber++;
    }

    public void addProduct(Product p) {
        if (count < products.length) {
            products[count] = p;
            count++;
        } else {
            System.out.println("Cart is full. Cannot add more products.");
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }
        return total;
    }
    public void showcart() {
        System.out.println("Cart contains:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + products[i].getName()) ;
        }
    }
    public static void printTotalCartNumber() {
       System.out.println("Total carts created: " + totalcartnumber);
    }
}
