package product_exception;


//  Create a product catalog
// ProductNotFoundException.
// if user try to add a product to cart which is not present
// throw ProductNotFoundException and handle it as well...

public class product {


    private String name;
    private  String[] catalog = {"pen", "pencil", "notebook"}; // Product catalog using array

    public product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    // Method to check if a product exists in the catalog using an array
    private boolean isProductInCatalog(String productName) {
        for (String product : catalog) {
            if (product.equals(productName)) {
                return true;
            }
        }
        return false;
    }

    // Method to add a product to the cart; throws exception if not found
    public void addProduct(String productName) {
        if (!isProductInCatalog(productName)) {
            throw new ProductNotFoundException( productName + " not found in the catalog.");
        } else {
            name = productName;
            System.out.println(productName + " has been added to your cart.");
        }
    }
}

class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}