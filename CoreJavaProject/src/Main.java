/* public , class , static, void - keyword
 Main - name of the class [ identifier ]
 The filename should be always the name of the class which is public
 highly cohesive [one class responsible for only similar type of functionalities]
 and loosely coupled applications
 Core Java -> console based applications CUI
 Desktop based applications : awt, swing GUI
 */
public class Main {



    // starting point is the main method
    // signature has to be exactly as it is here
    public static void main(String[] args) {
    long isbn = 1401603456;
        int x=2, y=50;
        do{
            ++x;
            y-=x++;
        }while(x<=10);
        System.out.println(y);
        System.out.println();
        // send output to the console
        System.out.print("Welcome"); // print will not take the cursor on the next line
        System.out.println("bye");// println will  take the cursor on the next line
        System.out.println("123127678234234");
        System.out.println("They didn't like it!!");
        // They said, "It's not good"
        // escape sequence : \n, \t
        System.out.println("They said,\"It's not good\"");
    }
}

/**
 *
 * Java versions jdk1.1, 1.2, 1.4,
 * 1.5 : M
 * 1.6 : little
 * 1.7 : switch-case , threads
 * 1.8: MAJOR => source code, compiler, interpreter
 * garbage collection
 * jdk8
 * jdk11 => string and date, http
 * jdk14
 * jdk17 => MAJOR
 * jdk19
 * jdk21
 *
 * SPRING : 5 , >5, tomcat (10 and jdk17) jakarta
 * BOOT : <2.
 *
 */
//// SOLID
//class A{
//
//}
//public class B{
//
//        }
