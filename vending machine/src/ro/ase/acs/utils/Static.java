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

        put(1, new ProductCreateCommand());
        put(2, new ProductListCommand());
        put(3, new ProductUpdateCommand());
        put(4, new ProductDeleteCommand());


        put(5, new VendingMachineCreateCommand());
        put(6, new VendingMachineListCommand());
        put(7, new VendingMachineUpdateCommand());
        put(8, new VendingMachineDeleteCommand());
        put(9, new VendingMachineMoveProductCommand());
        put(10, new VendingMachineAddProductCommand());

    }};
}
