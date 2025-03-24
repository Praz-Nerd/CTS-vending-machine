package ro.ase.acs.commands.vendingMachineCRUD;

import ro.ase.acs.commands.ICommand;
import ro.ase.acs.models.vending_machine.VendingMachine;

import java.util.Scanner;

public class VendingMachineDeleteCommand implements ICommand {
    @Override
    public void execute(Scanner cin) {
        System.out.println("Enter Vending Machine ID to delete: ");
        int id = cin.nextInt();

        VendingMachine.deleteVendingMachine(id);
    }
}
