package assignment;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {


//        if (floorno==1)
//            System.out.println("floor 1");
    // dice
        String country="";
        String state="";
        String city="";
        switch (country){
            case "London":
                switch (state){
                    case "":
                        switch (city){
                            case "":

                        }

                }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter floor number");
        int floorno = sc.nextInt();
        switch (floorno){
            default:
                System.out.println(floorno+" wrong floor no");
                break;
            case 1:
                System.out.println("floor 1");
                break;
            case 2:
                System.out.println("floor 2");
                break;
            case 3:
                System.out.println("floor 3");
                break;

        }
        // if you dont use break it is called as fall through
        // allowed types with switch-case : byte, char, short, int, String
        System.out.println("Enter month");
        String month = sc.next();
//        if(month=="Jan" || month=="Mar")
        switch (month){ // exact equality
            case "Jan":
            case "Mar":
            case "May":
            case "July":
            case "Aug":
            case "Oct":
            case "Dec":
                System.out.println(month + " has 31 days");
                break;
            case "Apr":
            case "June":
            case "Sep":
            case "Nov":
                System.out.println(month + " has 30 days");
                break;
        }


    }
}
