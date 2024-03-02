package interfaces;
// functional interfaces
@FunctionalInterface
public interface Filter {

    public  boolean isTrue(int no);
    default public int length(String s){
        return 0;
    };
}

