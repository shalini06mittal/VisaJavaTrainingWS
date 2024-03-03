package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ForEachWithCollection {
    public static void main(String[] args) {
        List<Integer> nos = new ArrayList<>();
        nos.add(10);
        nos.add(10);
        nos.add(20);
        nos.add(30);

        nos.forEach(no -> System.out.println(no * no));
        Map<Product, Integer> productIntegerMap = new TreeMap<>();
        productIntegerMap.put(new Product(1,"pencil",23),1);
        productIntegerMap.put(new Product(3,"eraser",15),3);
        productIntegerMap.put(new Product(4,"notebook",123), 8);
        productIntegerMap.put(new Product(2,"ruler",20), 10);
        productIntegerMap.put(new Product(5,"leds",50), 5);
        productIntegerMap.put(new Product(5,"leds1",50), 5);
        // http://.... ?k1=v1&k2=v2
        productIntegerMap.forEach((k, v)-> System.out.println(k+" "+v));

    }
}
