package ro.ase.acs.commands.productCRUD;

import ro.ase.acs.commands.ICommand;
import ro.ase.acs.models.product.Product;

import java.util.Scanner;

public class ProductDeleteCommand implements ICommand {
    @Override
    public void execute(Scanner cin) {
        Product.listProducts();
        System.out.println("Product id: ");
        int id = cin.nextInt();

        Product.deleteProduct(id);
    }
}
