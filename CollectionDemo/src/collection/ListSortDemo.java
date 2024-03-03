package collection;

import java.util.*;

public class ListSortDemo {

    public static void main(String[] args) {
        List<Integer> nos = new ArrayList<>();
        nos.add(200);
        nos.add(10);
        nos.add(10);
        nos.add(20);
        nos.add(30);

        System.out.println(nos);
       // Collections.sort(nos); // older versions < 11
        // since jdk 11
        //nos.sort(null);
        //nos.sort(new MyComparator());
        //nos.sort((n1, n2)-> n2.compareTo(n1));
        nos.sort(Comparator.reverseOrder());
        System.out.println(nos);
    }
}
class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}