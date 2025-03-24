package ro.ase.acs.commands.productCRUD;

import ro.ase.acs.commands.ICommand;
import ro.ase.acs.models.product.Product;
import ro.ase.acs.models.product.ProductType;
import ro.ase.acs.utils.Static;

import java.util.List;
import java.util.Scanner;

public class ProductListFilterCommand implements ICommand {
    @Override
    public void execute(Scanner scanner) {
        System.out.println("Filter by product type:");
        System.out.println("1 - HOT, 2 - COLD, 3 - IDK, 0 - No filter");
        int typeChoice = scanner.nextInt();

        ProductType selectedType;
        if (typeChoice == 1) selectedType = ProductType.HOT;
        else if (typeChoice == 2) selectedType = ProductType.COLD;
        else if (typeChoice == 3) selectedType = ProductType.IDK;
        else {
            selectedType = null;
        }

        System.out.print("Enter max price (or 0 for no filter): ");
        float maxPrice = scanner.nextFloat();

        List<Product> filteredProducts = Static.products.stream()
                .filter(p -> (selectedType == null || p.getProductType() == selectedType))
                .filter(p -> (maxPrice == 0 || p.getCost() <= maxPrice))
                .toList();

        if (filteredProducts.isEmpty()) {
            System.out.println("No products match the selected filters.");
        } else {
            filteredProducts.forEach(System.out::println);
        }
    }
}