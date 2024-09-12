import java.util.ArrayList;

class Product {
    public String productId;
    public String name;
    public String category;
    public int stockQuantity;
    public double pricePerUnit;

    public Product(String productId, String name, String category, int stockQuantity, double pricePerUnit) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.pricePerUnit = pricePerUnit;
    }

   
    public String toString() {
        return "ID: " + productId + ", Name: " + name + ", Category: " + category +
               ", Stock: " + stockQuantity + ", Price: $" + String.format("%.2f", pricePerUnit);
    }
}

class Inventory {
    public final ArrayList<Product> products;

    Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(String productId, String name, String category, int stockQuantity, double pricePerUnit) {
        Product newProduct = new Product(productId, name, category, stockQuantity, pricePerUnit);
        products.add(newProduct);
        System.out.println("Product '" + name + "' added successfully.");
    }

    public void viewInventory() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            products.forEach((product) -> {
                System.out.println(product);
            });
        }
    }
}


