package assignment;

public class Product {

    private int pid;
    private String prodname;
    private String description;
    private double price;
    private Category  category;
    private Supplier supplier;

    public Product() {
    }

    public Product(int pid, String prodname, String description, double price, Category category, Supplier supplier) {
        this.pid = pid;
        this.prodname = prodname;
        this.description = description;
        this.price = price;
        this.category = category;
        this.supplier = supplier;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", prodname='" + prodname + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", supplier=" + supplier +
                '}';
    }
}
