package interfaces;

public class PositiveFilter implements  Filter{

    @Override
    public boolean isTrue(int no) {
        return no>=0;
    }
}
