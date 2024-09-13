package product_exception;

public class productMain {
    public static void main(String[] args) {
        // Create a product object
        product product = new product("pencil");

        try {
            // Try to add an existing product
            product.addProduct("pen");

            // Try to add a product that is not in the catalog
            product.addProduct("eraser");  // This will throw ProductNotFoundException

        } catch (ProductNotFoundException e) {
            // Handle the exception when the product is not found
            System.out.println(e.getMessage());
        }

    }
}

