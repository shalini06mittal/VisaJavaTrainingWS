package collection;

import java.util.Objects;

public class Product implements Comparable<Product>{

    private int pid;
    private String name;
    private double price;

    public Product(int pid, String name, double price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
       //return this.getPid() - o.getPid();
        //return  o.getPid() - this.getPid();
        return o.getName().compareTo(this.getName());
    }


//    @Override
//    public int hashCode() {
//        System.out.println("hashcode coalled");
//        return 20;
//    }
//    @Override
//    public boolean equals(Object obj) {
//        System.out.println("equals called");
//
//        return this.getPid()==((Product)obj).getPid();
//    }


    @Override
    public boolean equals(Object o) {
        System.out.println("equals");
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        if (this.getPid() == product.getPid()) return  false;
        return pid == product.pid && Double.compare(price, product.price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hash");
        return Objects.hash(pid, name, price);
    }
}
