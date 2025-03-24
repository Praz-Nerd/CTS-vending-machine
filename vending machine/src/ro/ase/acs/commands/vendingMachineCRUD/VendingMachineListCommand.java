package ro.ase.acs.commands.vendingMachineCRUD;

import ro.ase.acs.commands.ICommand;
import ro.ase.acs.models.vending_machine.VendingMachine;

import java.util.Scanner;

public class VendingMachineListCommand implements ICommand {
    @Override
    public void execute(Scanner cin) {
        VendingMachine.listVendingMachines();
    }
}
