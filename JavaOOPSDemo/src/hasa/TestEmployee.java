package hasa;
import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month");
        String month = sc.next();
        Month m = Month.valueOf(month.toUpperCase());
        MyDate d1 = new MyDate(12, m, 2023);
        Employee e1 = new Employee(1, "Shalini",
                d1,
                new MyDate(1, Month.JAN, 1980));
        System.out.println(e1);
    }
}
