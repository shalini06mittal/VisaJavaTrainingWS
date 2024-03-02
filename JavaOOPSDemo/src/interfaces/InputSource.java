package interfaces;

import java.io.IOException;

/**
 * interface : keyowrd
 * 1. by default abstract
 * 2. objects cannot be created
 * 3. cannot have instance variables
 * 4. variables are by default final and static
 * 5. interfaces are implemented by the class using implements keyword
 * 6. class provides the implementation of abstract method or make itself abstract
 * 7. interface can extend other interface but CANNOT IMPLEMENT interface
 * 8. are like contracts
 */
//interface DefaultSource{
//    void m2();
//}
public  interface InputSource{//} extends  DefaultSource {
    static final int data =10;
     String getMessage() throws IOException;
     default void m1(){
         System.out.println("from interace");
     };
}
/**
 * Serializable
 * store emp, book, customer, item => db
 */
