package arrays;

public class ImmutableDemo {

    // scope is where the variable is declared and NOT initialized
    public static void m1(int x){ // local variable in m1 , has its own scope
        System.out.println("x in m1 -> BEFORE "+x);//20
        x+=100;
        System.out.println("x in m1 -> AFTER "+x);//120
    }
    public static void m2(int z[]){
        System.out.println("z[0] in m2 -> BEFORE "+z[0]);//20
        z[0]+=100;
        System.out.println("z[0] in m2 -> AFTER "+z[0]);//120
    }
    public static void stringdemo(String s){
        System.out.println("s in stringdemo -> BEFORE "+s);//20
        s = "Welcome";
        System.out.println("s in stringdemo "+s);//120
    }
    public static void main(String[] args) {
        int x = 20; // local variable, own scope in main
        System.out.println("y in main -> BEFORE "+x);//20
        m1(x);
        System.out.println("y in main -> AFTER "+x);//120, 20
        int a[] ={1,2,3,4,5};
        System.out.println("a[0] in main -> BEFORE "+a[0]);//20
        m2(a);
        System.out.println("a[0] in main -> AFTER "+a[0]);//120
        String s = "Hey";
        System.out.println("s in main -> BEFORE "+s);//20
        stringdemo(s);
        System.out.println("s in main -> AFTER "+s);//120
    }
}
