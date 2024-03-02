package statics;

import java.awt.*;

/**
 * static : access modifier
 * 1. can be used with method, instance variables and inner classes
 * 2. static members can be accessed directly by the name of the class
 * 3. No need to create object of the class to access static members
 * 4. static members cannot access non-static members directly
 * 5. non-static members can access static members directly
 * 6. static is kinda global and if it is not final changes made my any part
 * of the program affects globally
 * 7. they do not have access to "this"
 */

public  class StaticDemo {



//    static class Inner{
//
//    }
//    static {
//
//    }
    // rewards > reward item => ACTIVE, INACTIVE, SALE
    public final static String activeRewarditem = "ACTIVE";

    static void compressImage(byte n[])
    {
        int x;
        System.out.println("ACTIVE");
        System.out.println(activeRewarditem);
    }

    int id;
    static int count;
    StaticDemo(int c){
        id++;
        count+=c;
    }

    public int getId() {
        System.out.println("this "+this);//s2
        System.out.println(count);
        return id;
    }
    public static int getCount(StaticDemo ob) {
        System.out.println(ob.id);
       // System.out.println(this);
        return count;
    }

    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo(1);
        System.out.println("s1 "+s1);
        s1.getId();
        StaticDemo.getCount(s1);
        StaticDemo s2 = new StaticDemo(10);
        StaticDemo s3 = new StaticDemo(12);
        System.out.println(s2.id);
        System.out.println(StaticDemo.count);
        StaticDemo s4 = new StaticDemo(16);
        System.out.println();
        System.out.println(s1.id);
        System.out.println(s4.id);
        System.out.println(StaticDemo.count);

    }




}
