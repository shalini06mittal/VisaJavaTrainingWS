package strings;

import java.util.Scanner;
// lint errors
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = s2+" All";
        String s5 = "hello All";
        System.out.println(s1==s2);//t
        System.out.println(s1==s3);//t
        System.out.println(s4==s5);//f
        System.out.println(s4.equals(s5));

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string");
//        String s6 = sc.next();// hello
//        System.out.println(s1==s6);
//        System.out.println(s1.equals(s6));
//        System.out.println(!s1.equalsIgnoreCase(s6));

        String email = "shalini.mittal@gmail.com";
        System.out.println(email.endsWith("visa.com"));
        String url = "http://www.visa.com";
        System.out.println(url.startsWith("https"));
        System.out.println(email.length());
        System.out.println(email.charAt(0));
        System.out.println(email.charAt(email.length()-1));
        System.out.println(email.indexOf('@'));//14
        System.out.println(email.indexOf('.'));//7 => first occurence
        String domain = "http://www.amazon.co.uk";
        System.out.println(domain.indexOf('.'));
        System.out.println(domain.lastIndexOf('.'));
        // substring => part of a string
        // start value
        System.out.println(domain.substring(domain.lastIndexOf('.') +1));
        // start and end(exclusive) value
        int firstIndexOfDot = domain.indexOf('.');//10
        int secondIndexOfDot = domain.indexOf('.', firstIndexOfDot + 1);
        System.out.println(domain.substring( firstIndexOfDot +1, secondIndexOfDot+1 ));
        System.out.println(domain.charAt(domain.length()-1));
        /**
         *   compare to function returns
         *   first.compareTo(second) ASCII
         *   0 -> for exact equal values
         *   +ve -> first > second
         *   -ve -> first < second
          */

        System.out.println("apples".compareTo("apples"));// 0
        System.out.println("Apples".compareTo("apples"));// A - 65, a - 97, -ve
        System.out.println("apples".compareTo("Apples"));// +ve
        System.out.println("apples".compareTo("apricot"));// p < r
        System.out.println("apricot".compareTo("apples"));
        System.out.println("apple".compareTo("apples"));// length
        System.out.println("apples".compareTo("apple"));
        System.out.println("apples".compareTo("apple "));
        String s = "   Hey    There     ";
        System.out.println("**"+s+"**");
        System.out.println("**"+s.trim()+"**");
        System.out.println("**"+s.stripLeading()+"**");
        System.out.println("**"+s.stripTrailing()+"**");
        System.out.println("**"+s.strip()+"**");// trim vs strip

        System.out.println(); // shalini, shalini
        String name = "Tom";
        name = name.toUpperCase();
        System.out.println(name.replace('o','a'));
        System.out.println(name);

        System.out.println("".isBlank());
        System.out.println("      ".isBlank());
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        String data [] = "Shalini,8337831738217,2 Oct,Visa".split(",");
        for(String value: data)
            System.out.println(value);










    }
}
