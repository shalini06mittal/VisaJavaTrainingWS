package basic;

// user-defined data-type, composite data type
// loosely coupled, highly cohesive
// entity, model, reusable components / beans
public class Box {

    // dimensions, material, weight, color
    // data members of class Box
    // instance variables, have default values
    // access specifier - private
    private double height;
    private double width;
    private double length;
    String color;

    // methods => block of code with a name that can be used again and again
//    void setDimensions()
//    {
//        height = 2.0 / 10;
//        width = 2.0 / 10;
//        length = 2.0 / 10;
//    }
    // methods can take input
    // void => means nothing
    // take input, BL(body), output(response)
    // member methods => operate on the data
    void setDimensions(double h, double w, double l)
    {
        height = convert(h);
        width = w / 10;
        length = l / 10;
        color = "Brown";
    }
    private double convert(double value){
        return value/10;
    }

    // being called on box1
    public String displayBoxDimensions(){
        System.out.println(this);
        //System.out.println(height+" : "+width+" x "+length);
        return height+" : "+width+" : "+length;
    }
    // getter/ accessors
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return height;
    }
    public double getLength(){
        return height;
    }

    // setters / mutators
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
}
