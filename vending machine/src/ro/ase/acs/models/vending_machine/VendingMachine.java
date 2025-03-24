package ro.ase.acs.models.vending_machine;

import ro.ase.acs.models.compartment.Compartment;
import ro.ase.acs.utils.Static;

public class VendingMachine {
    private static int idCounter = 0;
    private int id;
    private String name;
    private String location;
    private Compartment compartment;

    public VendingMachine(String name, String location, Compartment compartment) {
        this.name = name;
        this.location = location;
        this.compartment = compartment;
        this.id = idCounter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        for (VendingMachine vm : Static.vendingMachines) {
            if (vm.getId() == id) {
                return vm;
            }
        }
        return null;
    }

    public static void addVendingMachine(VendingMachine vendingMachine) {
        Static.vendingMachines.add(vendingMachine);
        System.out.println("Vending Machine " + vendingMachine + " added to list.");
    }

    public static void updateVendingMachine(int id, String name, String location) {
        VendingMachine vm = VendingMachine.getVendingMachine(id);
        if (vm != null) {
            vm.setName(name);
            vm.setLocation(location);
            System.out.println("Vending Machine updated...");
        } else {
            System.out.println("Vending Machine not found.");
        }
    }

    public static void deleteVendingMachine(int id) {
        VendingMachine vm = VendingMachine.getVendingMachine(id);
        if (vm != null) {
            Static.vendingMachines.remove(vm);
            System.out.println("Vending Machine removed...");
        } else {
            System.out.println("Vending Machine not found.");
        }
    }

    public static void listVendingMachines() {
        System.out.println(Static.vendingMachines);
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
