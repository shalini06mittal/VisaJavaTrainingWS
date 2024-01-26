package basic;

public class LoopsDemo {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
            System.out.println(i+ " : "+(i*i));

        int x=1;
        while (x<=5){
            System.out.println(x*x*x);
            x++;
        }
        int y=1;
        do{
            System.out.println(Math.sqrt(y));
            y++;
        }while (y<=5);
        System.out.println();
        int a=1;
        while (a++<=5)
            System.out.println(a);
        System.out.println(a);


    }
}
