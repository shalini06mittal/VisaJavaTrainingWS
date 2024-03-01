package inheritance;
// is-a
// parent or base or super

/**
 * abstract modifier
 * only on classes or methods
 * abstarct class => cannot be instantiated using new
 * abstract methods => cannot have body or BL or cannot have {}
 * A class declared as abstract:
 * 1. cannot be instantiated
 * 2. may or may not have abstract methods
 * 3. if a class has even 1 abstract method => class should to be declared as abstract
 */
public abstract class Item {

    private int id;
    private String itemname;
    private String description;
    private double price;

    // child class is enforced to implememnt teh abstarct method or
    // declare itself as abstract
    public abstract double calculateMrp();

    public Item(){
        System.out.println("Item default constructor");
    }
    public Item(int id, String itemname, String description, double price) {
        System.out.println("Item parameterized constructor");
        this.id = id;
        this.itemname = itemname;
        this.description = description;
        this.price = price;
    }
    public Item(int id, String itemname,  double price) {
        this.id = id;
        this.itemname = itemname;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
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
        this.price = price + price * 0.01;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", itemname='" + itemname + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
