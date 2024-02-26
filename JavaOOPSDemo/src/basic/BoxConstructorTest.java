package basic;

public class BoxConstructorTest {
    public static void main(String[] args) {
        BoxConstructor b1 = new BoxConstructor();
        System.out.println(b1.calVolume());
        System.out.println(b1.getColor());
        BoxConstructor b2 = new BoxConstructor(2,3,5);
        b2.setHeight(5);
        System.out.println(b2.calVolume());
        System.out.println(b2.getColor());
        //2 ways to initialize the data members of the class
        // constructor
        // setters
        // represent the object in the form of string
        System.out.println(b2.toString());// print the state of b2

    }
}
