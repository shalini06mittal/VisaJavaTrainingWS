package interfaces;

import java.io.IOException;
import java.util.Scanner;

public class ScannerInputSource implements   InputSource{
    @Override
    public String getMessage() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter message");
        return  sc.next();
        //InputSource.data=100;
    }
}
