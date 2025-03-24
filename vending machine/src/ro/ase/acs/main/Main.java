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
        System.out.println("\nChoose an option:\n" +
                "1. Create product\n" +
                "2. List all products\n" +
                "3. Update product\n" +
                "4. Delete product\n" +
                "5. Create vending machine\n" +
                "6. List vending machines\n" +
                "7. Update vending machine\n" +
                "8. Delete vending machine\n" +
                "9. Move product between vending machines\n" +
                "10. Add product to vending machine\n" +
                "0. Exit");
    }

}
