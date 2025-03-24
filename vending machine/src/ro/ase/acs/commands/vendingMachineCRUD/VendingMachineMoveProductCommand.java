package ro.ase.acs.commands.vendingMachineCRUD;

import ro.ase.acs.commands.ICommand;
import ro.ase.acs.models.product.Product;
import ro.ase.acs.models.vending_machine.VendingMachine;


import java.util.Scanner;

public class VendingMachineMoveProductCommand implements ICommand {
    @Override
    public void execute(Scanner scanner) {
        System.out.print("Enter product ID to move: ");
        int productId = scanner.nextInt();
        System.out.print("Enter source vending machine ID: ");
        int sourceId = scanner.nextInt();
        System.out.print("Enter destination vending machine ID: ");
        int destId = scanner.nextInt();

        VendingMachine source = VendingMachine.getVendingMachine(sourceId);
        VendingMachine destination = VendingMachine.getVendingMachine(destId);

        if (source == null || destination == null) {
            System.out.println("Invalid vending machine ID");
            return;
        }

        Product product = source.getCompartment().getProductList().stream()
                .filter(p -> p.getId() == productId)
                .findFirst().orElse(null);

        if (product == null) {
            System.out.println("Product not found in source vending machine");
            return;
        }

        if (destination.addProduct(product)) {
            source.removeProduct(product);
            System.out.println("Moved " + product.getName() + " to " + destination.getName());
        } else {
            System.out.println("Move failed due to compartment restrictions.");
        }
    }
}
