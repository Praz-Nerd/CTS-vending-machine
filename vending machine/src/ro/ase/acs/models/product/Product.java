package ro.ase.acs.models.product;

import ro.ase.acs.utils.Static;

public class Product {
    private static int idCounter = 0;
    private ProductType productType;
    private int id;
    private String name;
    private float cost;

    public Product(ProductType productType, String name, float cost) {
        this.productType = productType;
        this.name = name;
        this.cost = cost;
        this.id = idCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isBlank())
            this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if(cost > 0f)
            this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public static Product getProduct(int id){
        for(Product p : Static.products){
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public static void addProduct(Product product){
        Static.products.add(product);
        System.out.println("Product " + product + " added to list");
    }

    public static void updateProduct(int id, String name, float cost){
        Product p = Product.getProduct(id);
        if(p!=null){
            p.setCost(cost);
            p.setName(name);
            System.out.println("Product updated...");
        }
        else
            System.out.println("Product not found");
    }

    public static void deleteProduct(int id){
        Product p = Product.getProduct(id);
        if(p != null){
            Static.products.remove(p);
            System.out.println("Product removed...");
        }
        else{
            System.out.println("Product not found");
        }
    }

    public static void listProducts(){
        System.out.println(Static.products);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productType=" + productType +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
