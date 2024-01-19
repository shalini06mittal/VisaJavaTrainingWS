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

//// SOLID
//class A{
//
//}
//public class B{
//
//        }
