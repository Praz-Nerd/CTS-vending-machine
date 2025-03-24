package ro.ase.acs.utils;

import ro.ase.acs.commands.ICommand;
import ro.ase.acs.commands.productCRUD.*;
import ro.ase.acs.commands.vendingMachineCRUD.*;
import ro.ase.acs.models.product.Product;
import ro.ase.acs.models.vending_machine.VendingMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Static {
    public static List<Product> products = new ArrayList<>();
    public static List<VendingMachine> vendingMachines = new ArrayList<>();

    public static Map<Integer, ICommand> commandMap = new HashMap<>(){{


        put(1, new VendingMachineCreateCommand());
        put(2, new VendingMachineListCommand());
        put(3, new VendingMachineUpdateCommand());
        put(4, new VendingMachineDeleteCommand());


        put(5, new ProductCreateCommand());
        put(6, new ProductListCommand());
        put(7, new ProductUpdateCommand());
        put(8, new ProductDeleteCommand());
        put(9, new ProductListFilterCommand());


        put(10, new VendingMachineAddProductCommand());
        put(11, new VendingMachineMoveProductCommand());

    }};
}
