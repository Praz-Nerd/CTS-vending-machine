package ro.ase.acs.models.compartment;

import ro.ase.acs.models.product.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class Compartment {
    protected List<Product> productList;
    protected int maxCapacity;

    public Compartment(int capacity) {
        this.productList = new ArrayList<>();
        this.maxCapacity = capacity;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public abstract void addProduct(Product product);

    @Override
    public String toString() {
        return "Compartment{" +
                "type=" + getClass().getSimpleName() +
                ", maxCapacity=" + maxCapacity +
                ", products=" + productList +
                '}';
    }
}
