package ro.ase.acs.models.compartment;

import ro.ase.acs.models.product.Product;
import ro.ase.acs.models.product.ProductType;

public class HotCompartment extends Compartment{
    public HotCompartment(int capacity) {
        super(capacity);
    }

    @Override
    public void addProduct(Product product) {
        if(productList.size() <= maxCapacity){
            if(product.getProductType() == ProductType.HOT || product.getProductType() == ProductType.IDK)
                this.productList.add(product);
            else
                System.out.println("Product is not hot or idk");
        }
        else
            System.out.println("Capacity exceeded");
    }
}
