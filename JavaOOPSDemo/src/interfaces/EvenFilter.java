package interfaces;

public class EvenFilter implements  Filter{

    @Override
    public boolean isTrue(int no) {
        return no%2==0;
    }
}
