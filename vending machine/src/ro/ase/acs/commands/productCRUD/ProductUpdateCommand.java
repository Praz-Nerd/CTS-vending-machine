package ro.ase.acs.commands.productCRUD;

import ro.ase.acs.commands.ICommand;
import ro.ase.acs.models.product.Product;

import java.util.Scanner;

public class ProductUpdateCommand implements ICommand {
    @Override
    public void execute(Scanner cin) {
        Product.listProducts();
        System.out.println("Id of product: ");
        int id = cin.nextInt();
        System.out.println("New name(press Enter to keep name): ");
        String name = cin.nextLine();
        cin.nextLine();
        System.out.println("New cost(press 0 to keep cost): ");
        float cost = cin.nextFloat();

        Product.updateProduct(id, name, cost);
    }
}
