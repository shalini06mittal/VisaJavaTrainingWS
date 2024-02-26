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
        // reserve memory for 5 boxes
        BoxConstructor boxes[]  = new BoxConstructor[5];
        System.out.println(boxes[0]);
        boxes[0] = b2;
        boxes[1] = new BoxConstructor(2,3,4);
        System.out.println(boxes[0].calVolume());
        System.out.println(boxes[1].calVolume());
        System.out.println(boxes[2].calVolume());

    }
}
