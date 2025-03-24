package ro.ase.acs.commands.vendingMachineCRUD;

import ro.ase.acs.commands.ICommand;
import ro.ase.acs.models.vending_machine.VendingMachine;
import ro.ase.acs.models.compartment.ColdCompartment;
import ro.ase.acs.models.compartment.HotCompartment;
import ro.ase.acs.utils.Static;

import java.util.Scanner;

public class VendingMachineCreateCommand implements ICommand {
    @Override
    public void execute(Scanner cin) {
        System.out.println("Vending Machine name: ");
        cin.nextLine();
        String name = cin.nextLine();

        System.out.println("Location: ");
        String location = cin.nextLine();

        System.out.println("Compartment type [hot, cold]: ");
        String type = cin.nextLine().toLowerCase();

        System.out.println("Enter compartment capacity: ");
        int capacity = cin.nextInt();

        VendingMachine vendingMachine;

        if (type.equals("hot")) {
            vendingMachine = new VendingMachine(name, location, new HotCompartment(capacity));
        } else if (type.equals("cold")) {
            vendingMachine = new VendingMachine(name, location, new ColdCompartment(capacity));
        } else {
            System.out.println("Invalid compartment type! Please enter 'hot' or 'cold'.");
            return;
        }

        VendingMachine.addVendingMachine(vendingMachine);
    }
}
