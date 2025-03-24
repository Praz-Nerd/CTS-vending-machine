package ro.ase.acs.commands.vendingMachineCRUD;

import ro.ase.acs.commands.ICommand;
import ro.ase.acs.models.product.Product;
import ro.ase.acs.models.vending_machine.VendingMachine;
import ro.ase.acs.utils.Static;

import java.util.Scanner;

public class VendingMachineAddProductCommand implements ICommand {
    @Override
    public void execute(Scanner scanner) {
        System.out.print("Enter Vending Machine ID: ");
        int vendingMachineId = scanner.nextInt();

        VendingMachine vendingMachine = VendingMachine.getVendingMachine(vendingMachineId);
        if (vendingMachine == null) {
            System.out.println("Vending machine not found.");
            return;
        }

        System.out.print("Enter Product ID: ");
        int productId = scanner.nextInt();

        Product product = Product.getProduct(productId);
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        if (vendingMachine.addProduct(product)) {
            System.out.println("Product " + product.getName() + " added to vending machine " + vendingMachine.getName());
        } else {
            System.out.println("Could not add product due to compartment restrictions.");
        }
    }
}
