package assignment;

import java.util.Scanner;

public class TestProduct {

    public static void main(String[] args) {
        Supplier s1 = new Supplier(1,"Apple", "California","contact@apple.com","1212121212");
        Supplier s2 = new Supplier(2,"Publisher", "Mumbai","contact@pub.com","8787878787");

        Product products[] = new Product[5];
        products[0] = new Product(1,"Mac Pro Laptop","With amazing new features",123456.89,Category.ELECTRONICS,s1);
        products[1] = new Product(2,"Single line notebook","Has darker and braoad lines",125,Category.BOOKS,s2);
        products[2] = new Product(3,"Mac Pro Adapter","Provides support for HDMI",5000,Category.ELECTRONICS,s1);
        products[3] = new Product(4,"Guliver Travels","Adventurous journey of Guliver ",569,Category.BOOKS,s2);
        products[4] = new Product(5,"Mac Air Laptop","With amazing new features and light weight",98762.98,Category.ELECTRONICS,s1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Category number from the below");
        for(Category category: Category.values())
            System.out.println(category.ordinal()+1 +" "+category.name());
        int categoryid = scanner.nextInt();
        Category categoryChoice = null;
        for(Category category: Category.values()){
            if (category.ordinal()+1 == categoryid){
                categoryChoice = category;
                break;
            }
        }

        System.out.println(categoryChoice);
        for(Product product : products){
            if (product.getCategory().equals(categoryChoice)){
                System.out.println(product);
            }
        }
    }
}
