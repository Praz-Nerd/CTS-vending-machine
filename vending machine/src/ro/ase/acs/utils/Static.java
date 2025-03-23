package ro.ase.acs.utils;

import ro.ase.acs.models.product.Product;
import ro.ase.acs.models.vending_machine.VendingMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Static {
    public static List<Product> products = new ArrayList<>();
    public static List<VendingMachine> vendingMachines = new ArrayList<>();
    public static Map<Integer, String> map = new HashMap<>();

    public static List<Product> getProducts() {
        return products;
    }

    public static List<VendingMachine> getVendingMachines() {
        return vendingMachines;
    }

    public static Map<Integer, String> getMap() {
        return map;
    }
}
