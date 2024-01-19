package basic;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println();
        System.out.println(15+6);
        System.out.println(15-6);
        System.out.println(15*6);
        System.out.println(15/6);// quotient
        System.out.println(15%6);// remainder
        System.out.println(15/6.0);
        // pure expression : an expression that consists of values of same type
        System.out.println(1+2+3+89);
        System.out.println(1.2+3.4+5.6);
        // impure expression
        System.out.println(1+2+'a'+3.5);// 3+97+3.5
        System.out.println(1+2+"a"+'s');
        // pure expression results in pure values i.e the output is of the same type
        System.out.println(5/3);
        // impure expression results in impure values i.e the output is of the higher type
        System.out.println(5/3.0);
        // calculate discount : 5% on 1000
        System.out.println(5.0/100 * 1000);
        System.out.println(1000 * 5/100 );

        // luhn algorithm

        int no = 8767867;
        // decimal : base 10 1* 100 + 2* 10 + 3*1
        int r = no%10;
        System.out.println(r);
        no = no/10;
        System.out.println(no);
        r = no%10;
        System.out.println(r);
        no = no/10;
        System.out.println(no);

    }
}
