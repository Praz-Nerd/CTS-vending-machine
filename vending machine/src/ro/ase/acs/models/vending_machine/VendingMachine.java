package ro.ase.acs.models.vending_machine;

import ro.ase.acs.models.compartment.Compartment;

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
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Compartment getCompartment() {
        return compartment;
    }

    public void setCompartment(Compartment compartment) {
        this.compartment = compartment;
    }
}
