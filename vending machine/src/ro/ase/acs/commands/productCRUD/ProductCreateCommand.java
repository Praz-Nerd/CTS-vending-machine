package ro.ase.acs.commands.productCRUD;

import ro.ase.acs.commands.ICommand;
import ro.ase.acs.models.product.Product;
import ro.ase.acs.models.product.ProductType;

import java.util.Scanner;

//attributes: name, cost, type
public class ProductCreateCommand implements ICommand {
    @Override
    public void execute(Scanner cin) {
        System.out.println("Name: ");
        cin.nextLine();
        String name = cin.nextLine();
        System.out.println("Cost: ");
        float cost = cin.nextFloat();
        System.out.println("Type [hot, cold, idk]: ");
        cin.nextLine();
        String type = cin.nextLine();

        Product.addProduct(new Product(ProductType.valueOf(type.toUpperCase()), name, cost));

    }
}
