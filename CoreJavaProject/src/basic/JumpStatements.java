package basic;

public class JumpStatements {
    public static void main(String[] args) {
        int i=1;
        for (; i < 5; i++) {
            // csv file 1000 lines => every line : 1 customer data
            // break => used only with loops or switch - case
            //break has to be condiional inside the loop
            if (i==30)
                break;
            System.out.println(i);
        }
        System.out.println("outside the loop "+i);
        // prime number => educational app
        int n = 7;
        int isPrime = 1;
        for (int j = 2; j < n/2; j++) {
            if(n%j==0)
            {
                isPrime = 0;
                break;
            }
        }
        if(isPrime==1)
            System.out.println(n+" is prime");
        else
            System.out.println(n+ " is not prime");
    // clap 1
        System.out.println();
        for(int a=1;a<=20;a++){
//            if(a%5==0)
//                continue;
            if(a%5!=0)
                System.out.println("Clap "+a);
        }

    }
}
