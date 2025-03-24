package ro.ase.acs.models.vending_machine;

import ro.ase.acs.models.compartment.Compartment;
import ro.ase.acs.models.product.Product;
import ro.ase.acs.utils.Static;

public class VendingMachine {
    private static int idCounter = 0;
    private int id;
    private String name;
    private String location;
    private Compartment compartment;

    public VendingMachine(String name, String location, Compartment compartment) {
        this.id = idCounter++;
        this.name = name;
        this.location = location;
        this.compartment = compartment;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isBlank())
            this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (!location.isBlank())
            this.location = location;
    }

    public Compartment getCompartment() {
        return compartment;
    }

    public void setCompartment(Compartment compartment) {
        this.compartment = compartment;
    }

    public static VendingMachine getVendingMachine(int id) {
        return Static.vendingMachines.stream()
                .filter(vm -> vm.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static void addVendingMachine(VendingMachine vendingMachine) {
        Static.vendingMachines.add(vendingMachine);
        System.out.println("Vending Machine added: " + vendingMachine);
    }

    public static void updateVendingMachine(int id, String name, String location) {
        VendingMachine vm = getVendingMachine(id);
        if (vm != null) {
            vm.setName(name);
            vm.setLocation(location);
            System.out.println("Vending Machine updated: " + vm);
        } else {
            System.out.println("Vending Machine not found.");
        }
    }

    public static void deleteVendingMachine(int id) {
        VendingMachine vm = getVendingMachine(id);
        if (vm != null) {
            Static.vendingMachines.remove(vm);
            System.out.println("Vending Machine removed.");
        } else {
            System.out.println("Vending Machine not found.");
        }
    }

    public static void listVendingMachines() {
        if (Static.vendingMachines.isEmpty()) {
            System.out.println("No vending machines available.");
        } else {
            Static.vendingMachines.forEach(System.out::println);
        }
    }


    public boolean addProduct(Product product) {
        if (compartment == null) {
            System.out.println("This vending machine has no compartment assigned.");
            return false;
        }

        compartment.addProduct(product);
        return true;
    }

    public boolean removeProduct(Product product) {
        return compartment.getProductList().remove(product);
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", compartment=" + compartment +
                '}';
    }
}
