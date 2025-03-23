package ro.ase.acs.models.product;

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
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
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
}
