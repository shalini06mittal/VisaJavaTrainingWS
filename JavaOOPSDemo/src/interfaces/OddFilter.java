package interfaces;

public class OddFilter implements  Filter{

    @Override
    public boolean isTrue(int no) {
        return no%2!=0;
    }
}
