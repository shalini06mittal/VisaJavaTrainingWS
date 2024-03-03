package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "1K1");
        System.out.println(map.put(5, "K20"));
        System.out.println(map.put(1, "K13"));
        map.put(2, "K12");
        map.put(4, "K12");
        map.put(3, "K1");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.keySet());
        System.out.println(map.values());

        Map<Product, Integer> productIntegerMap = new TreeMap<>();
        productIntegerMap.put(new Product(1,"pencil",23),1);
        productIntegerMap.put(new Product(3,"eraser",15),3);
        productIntegerMap.put(new Product(4,"notebook",123), 8);
        productIntegerMap.put(new Product(2,"ruler",20), 10);
        productIntegerMap.put(new Product(5,"leds",50), 5);
        productIntegerMap.put(new Product(5,"leds1",50), 5);
        System.out.println(productIntegerMap.size());

        Set<Map.Entry<Product, Integer>> set=  productIntegerMap.entrySet();
        for(Map.Entry<Product, Integer> entry: set)
            System.out.println(entry.getKey()+" "+entry.getValue());


    }
}
