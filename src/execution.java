
import java.util.Scanner;

public class execution {

    
    public class executionManagement {

       
        public void main(String[] args) {
            Inventory execution = new Inventory();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nInventory Management System");
                System.out.println("1. Add Product");
                System.out.println("2. View Inventory");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.print("Enter product ID: ");
                        String productId = scanner.nextLine();
                        System.out.print("Enter product name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter product category: ");
                        String category = scanner.nextLine();
                        System.out.print("Enter stock quantity: ");
                        int stockQuantity = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter price per unit: $");
                        double pricePerUnit = Double.parseDouble(scanner.nextLine());

                        execution.addProduct(productId, name, category, stockQuantity, pricePerUnit);
                        break;

                    case "2":
                        System.out.println("\nInventory List:");
                        execution.viewInventory();
                        break;

                    case "3":
                        System.out.println("Exiting the program.");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                        break;
                }
            }
        }
    }
}
