package basic;

public class TestBox {

    // UI
    public static void main(String[] args) {
        // takes input from the user
        // variable declaration
        Box box1; // reference variable of type Box
        // allocate memory => new
        box1 = new Box(); // 2x2x2 , mm, cms
//        box1.height= 2/10;
//        box1.width= 2/10;
//        box1.length= 2/10;
        box1.setDimensions(2,5,7);

        Box box2 = new Box();
//        box2.height= 2/10;
//        box2.width= 3/10;
//        box2.length= 5/10;
        box2.setDimensions(3,4,5);
        System.out.println(box1);
        System.out.println("Box1 dimensions");
        System.out.println(box1);
        box1.displayBoxDimensions();

        //System.out.println(box1.height+" x "+box1.width+" x "+box1.length);
        //box2.height = 6;
        System.out.println();
        System.out.println("Box2 dimensions");
        System.out.println(box2);
        //System.out.println(box2.height+" x "+box2.width+" x "+box2.length);
        box2.displayBoxDimensions();

        //displayBoxDimensions(box2);
    }
    public static void displayBoxDimensions(Box box){
        System.out.println(box.getHeight()+" x "+box.getLength()+" x "+box.getWidth());
    }

}
