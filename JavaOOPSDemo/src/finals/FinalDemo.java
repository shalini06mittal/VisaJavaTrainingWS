package finals;

import java.util.Scanner;

public class FinalDemo {

    /**
     * final - access modifier,
     * class : cannot inherit
     * method: cannot override
     * instance or local variables : canot modify
     */
    public static void main(String[] args) {
        final int x = 10;
        //x = 100;

    }

}

final class  X{

}
//class Y extends  X{}
class Z{
    public final void m1(){}
    public  void m2(){}
}
class S extends Z{


    @Override
    public void m2() {
        super.m2();
    }
}
