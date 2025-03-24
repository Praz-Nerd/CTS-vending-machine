package ro.ase.acs.main;

import ro.ase.acs.commands.ICommand;
import ro.ase.acs.utils.Static;

import java.util.Scanner;

public class Main {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            displayMenu();
            while (!cin.hasNextInt()) { // Ensures valid input
                System.out.println("Invalid input. Please enter a number:");
                cin.next();
            }
            choice = cin.nextInt();

            ICommand command = Static.commandMap.get(choice);
            if (command != null) {
                command.execute(cin);
            } else if (choice != 0) {
                System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 0);

        System.out.println("Exiting vending machine...");
        cin.close();
    }

    private static void displayMenu() {
        System.out.println("\n====== VENDING MACHINE SYSTEM ======");
        System.out.println("Vending Machine Management:");
        System.out.println("  1 - Create vending machine");
        System.out.println("  2 - List vending machines");
        System.out.println("  3 - Update vending machine");
        System.out.println("  4 - Delete vending machine");

        System.out.println("\nProduct Management:");
        System.out.println("  5 - Create product");
        System.out.println("  6 - List products");
        System.out.println("  7 - Update product");
        System.out.println("  8 - Delete product");
        System.out.println("  9 - List products with filters");

        System.out.println("\nOperations on Vending Machines:");
        System.out.println(" 10 - Add product to vending machine");
        System.out.println(" 11 - Move product between vending machines");

        System.out.println("\n  0 - Exit");
        System.out.print("\nSelect an option: ");
    }


}
