package assignment;

import java.util.Scanner;
/**
 * Ask the user how many customers
 * for every customer ask how many tickets and name of the customer
 * for every ticket ask the age and based on age calculate the total amount to be paid
 * for that customer
 * age<=5 : 0
 * age bet 5 and 12 : 100
 * age >12 and <18 : 130
 * > 18 : 160
 * Output should be:
 * Customer 1:
 * Shalini: 4:320
 * Customer 2:
 *
 */
public class TicketBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ans = 'y';
        int c= 1;
        do{
            System.out.println("Enter name for customer "+c++);
            String name = sc.next();
            System.out.println("How many tickets?");
            int nooftickets = sc.nextInt();
            int total = 0;
            for (int i = 1; i <= nooftickets; i++) {
                System.out.println("Enter age for ticket "+i);
                int age = sc.nextInt();
                if(age<=5)
                    total+=0;
                else if(age<=12)
                    total+=100;
                else if (age<=18) {
                    total+=130;
                }
                else total+=160;
            }
            System.out.println("Total amount for customer "+name+" :- "+total);
            System.out.println("More customer? y or n");
            ans = sc.next().charAt(0);
        }while(ans=='y' || ans =='Y');
    }
}
