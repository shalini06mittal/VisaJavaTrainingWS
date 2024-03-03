package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add("87908");
        System.out.println(list.size());
        list.add(10.987);
        list.add(true);
        list.add(10.9f);
        list.add('s');
        System.out.println(list.size());
        System.out.println(list.remove(3));
        System.out.println(list.size());
        System.out.println(list);
        System.out.println();
        //System.out.println(list.get(20));
        for (int i=0;i<list.size();i++)
            System.out.println(list.get(i));

        System.out.println();
        for (Object o: list) {
            System.out.println(o);
        }

        Iterator<Integer> iterator =  list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        int sum = 0;
//        for (Object o: list) {
//           sum += (int)o;
//        }
        System.out.println();
        // mathematical operations or operations relative to the type of data
        // use generics and specify the type
        List<Integer> nos = new ArrayList<>();
        nos.add(10);
        nos.add(10);
        nos.add(20);
        nos.add(30);
        int sum = 0;
        for (Integer o: nos) {
            sum += o;
        }
        System.out.println(sum);

        List<Integer> nos1 = new LinkedList<>();
        System.out.println(nos.indexOf(10));



    }
}
