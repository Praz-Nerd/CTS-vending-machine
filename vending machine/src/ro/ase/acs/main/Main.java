package ro.ase.acs.main;

import ro.ase.acs.commands.ICommand;
import ro.ase.acs.utils.Static;

import java.util.Scanner;

public class Main {
    //hashmap choice: Command.execute()
    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        System.out.println("Choose an option:\n" +
                            "1. Create product\n" +
                            "2. List all products\n" +
                            "3. Update product\n" +
                            "4. Delete product");
        choice = cin.nextInt();
        while (choice != 0){
            ICommand command = Static.commandMap.get(choice);
            if(command != null)
                command.execute(cin);

            System.out.println("Choose an option:\n" +
                    "1. Create product\n" +
                    "2. List all products\n" +
                    "3. Update product\n" +
                    "4. Delete product");
            choice = cin.nextInt();
        }
        cin.close();
    }
}