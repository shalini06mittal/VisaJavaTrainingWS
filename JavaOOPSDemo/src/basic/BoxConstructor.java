package basic;

public class BoxConstructor {
    private double height;
    private double width;
    private double length;
    String color;

    /**
     * Constructor : purpose is to initialize the data members of the class
     * construct the object with some data or some state
     * 1. It is a function but with NO RETURN TYPE
     * 2. Name is exactly the same as the class name
     * 3. It is automatically  invoked or called when the object of hte class is created using new
     * 4. You do not call constructor using .
     *
     * polymorphism :
     * static : constructor/ method overloading
     * 1. change the number of parameters
     * 2. change the type of parameters
     * 3. change the sequence of parameters
     * 4. CHANGING RETURN TYPE / ACCESS SPECIFIER / METHOD NAME IS NOT OVERLOADING
     * @param h
     * @param w
     * @param l
     */

    // explicit default constructor
    public BoxConstructor(){
        System.out.println("Box explicit default constructor");
        height = 2;
        length = 2;
        width = 2;
        color = "Brown";
    }

    // parameterized constructor
    public BoxConstructor(double h, double w, double l){
        System.out.println("Box explicit default constructor");
        height = convert(h);
        width = w / 10;
        length = l / 10;
        color = "Brown";
    }
    public BoxConstructor(double h, double w, double l, String color){
        System.out.println("Box explicit default constructor");
        height = convert(h);
        width = w / 10;
        length = l / 10;
        this.color = color;
    }
    public BoxConstructor(String color, double w, double l, double h){
        System.out.println("Box explicit default constructor");
        height = convert(h);
        width = w / 10;
        length = l / 10;
        this.color = color;
    }
    private double convert(double value){
        return value/10;
    }

    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return height;
    }
    public double getLength(){
        return height;
    }


    public void setWidth(double w){
        width = w;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  double calVolume(){
        return height*length*width;
    }

//    @Override // it is coming from parent class => Object
//    public String toString() {
//        return "Length "+length+" Width "+width+" Height "+height;
//    }
}
