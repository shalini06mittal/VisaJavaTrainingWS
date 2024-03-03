package collection;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//        set.add(10);
//        set.add(1);
//        set.add(10);
//        set.add(4);
//        set.add(78);
//        set.add(100);
//        set.add(20);
//        set.add(90);
//        System.out.println(set);
//        for (Integer value:set) {
//            System.out.println(value);
//        }
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        set.add(10);
        set.add(1);
        set.add(10);
        set.add(4);
        set.add(78);
        set.add(100);
        set.add(20);
        set.add(90);
//        System.out.println(set);
//        for (Integer value:set) {
//            System.out.println(value);
//        }

        Set<Product> products = new HashSet<>();
        Product p1 = new Product(1,"pencil",23);
        Product p2= new Product(3,"eraser",15);
        Product p3 = new Product(1,"pencil",23);
        Product p4 = p1;// same reference or mem address
        System.out.println("item 1");
        products.add(p1);// 20
        System.out.println("item 2");
        products.add(p2);//20
        products.add(p3);
        products.add(p4);
        System.out.println(products.size());

    }
}
