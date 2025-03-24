package ro.ase.acs.commands.productCRUD;

import ro.ase.acs.commands.ICommand;
import ro.ase.acs.models.product.Product;

import java.util.Scanner;

public class ProductListCommand implements ICommand {
    @Override
    public void execute(Scanner cin) {
        Product.listProducts();
    }
}
