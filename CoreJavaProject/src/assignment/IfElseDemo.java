package assignment;

public class IfElseDemo {
    public static void main(String[] args) {
        int x=10;
        // truthy and falsy values
        // curly braces are optional only if there is a single statement to execute
        if(x%10==0) {
            System.out.println("yes");
            //System.out.println("You can login");
        }
        else {
            System.out.println("no");
        }
        System.out.println(1);
        if(true)
            System.out.println("3");
        System.out.println(4);
    }
}
