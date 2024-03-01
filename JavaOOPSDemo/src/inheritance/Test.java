package inheritance;

import hasa.Employee;

class A{ }
class B extends  A{}
class C extends  B{}
class D extends  C{}
public class Test {

    public static void main(String[] args) {

//        Item item = new Item();
//        item.setId(1);

        /**
         * when child class object is created ,
         * it first calls the parent/parent...
         * constructor
          */

        Book b1 = new Book();
        b1.setId(2);
        b1.setAuthor("");
        System.out.println();
        Chair chair = new Chair() ;
        System.out.println();
        callCalculate(new Book());
        System.out.println();
        callCalculate(chair);
        //callCalculate(new Employee());
        /**
         * parent class reference [ ob ] can be passed object of its child class [ b1, chair, new Book() ]
         */
        Item ob = new Book();
        System.out.println();

        Book b2 = new Book(1,"Twilight","suspense book",456,2010,"Shalini");
        System.out.println(b2);
    }
    // item =book
    // item = chair
    public static void callCalculate(Item item){
        System.out.println(item.calculateMrp());
    }
//    public static void callCalculate(Book book){
//        System.out.println(book.calculateMrp());
//    }
//    public static void callCalculate(Chair chair){
//        System.out.println(chair.calculateMrp());
//    }
}
