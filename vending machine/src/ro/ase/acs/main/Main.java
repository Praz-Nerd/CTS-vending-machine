package ro.ase.acs.main;

import ro.ase.acs.models.product.Product;
import ro.ase.acs.utils.Static;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //hashmap choice: Command.execute()
    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        Static.getMap().put(1, "Create");
        System.out.println("Choose an option:\n" +
                            "1. Create product\n" +
                            "2. List all products\n" +
                            "3. Update product\n" +
                            "4. Delete product");
        choice = cin.nextInt();
        while (choice != 0){
            System.out.println(Static.getMap().get(choice));
            choice = cin.nextInt();
        }
        cin.close();
    }
}