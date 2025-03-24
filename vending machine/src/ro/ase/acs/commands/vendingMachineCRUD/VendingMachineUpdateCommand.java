package ro.ase.acs.commands.vendingMachineCRUD;

import ro.ase.acs.commands.ICommand;
import ro.ase.acs.models.vending_machine.VendingMachine;

import java.util.Scanner;

public class VendingMachineUpdateCommand implements ICommand {
    @Override
    public void execute(Scanner cin) {
        System.out.println("Enter Vending Machine ID: ");
        int id = cin.nextInt();
        cin.nextLine();

        System.out.println("New name: ");
        String name = cin.nextLine();

        System.out.println("New location: ");
        String location = cin.nextLine();

        VendingMachine.updateVendingMachine(id, name, location);
    }
}
