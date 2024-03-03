package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListProductDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1,"pencil",23));
        products.add(new Product(3,"eraser",15));
        products.add(new Product(4,"notebook",123));
        products.add(new Product(2,"ruler",20));
        products.add(new Product(5,"leds",50));


        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println();
        //products.sort(null);
        Collections.sort(products);
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println();
        //products.sort(null);
//        Collections.sort(products,
//                (p1, p2)-> p1.getName().compareTo(p2.getName()));
        // method reference
        Collections.sort(products,
                Comparator.comparing(Product::getName));
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println();
        Collections.sort(products,
                Comparator.comparing(Product::getPrice));
        for (Product p : products) {
            System.out.println(p);
        }

    }
}
