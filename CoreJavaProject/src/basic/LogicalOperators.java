package basic;

public class LogicalOperators {

    public static void main(String[] args) {

        // & | !

        // Is 25 divisible by 3 and 5 : F
        // Is 25 divisible by 3 or 5 : T

        int no = 25;
        boolean exp1 = no % 3 == 0;
        boolean exp2 = no % 5 == 0;
        System.out.println(exp1 & exp2);
        System.out.println(exp1 | exp2);
        System.out.println();
        // && || => short-circuit , performance
        int x = 10;
//        System.out.println(x>=10 && ++x == 10);
//        System.out.println(x);//11

        System.out.println(x>10 && x++ == 10);
        System.out.println(x);//11
    }
}
