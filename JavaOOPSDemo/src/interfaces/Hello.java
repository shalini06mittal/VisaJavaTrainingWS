package interfaces;

import java.io.File;
import java.io.IOException;

public class Hello {
    public static void main(String[] args) throws IOException {
        /**
         * 1. provide dynamic messages =>
         * Scanner , CLA
         * database
         * file
         * network
         */
//        ScannerInputSource s1 = new ScannerInputSource();
//        FileInputSource f1 = new FileInputSource();
//        InputSource inputSource = s1;
//        String message = inputSource.getMessage();
//
//        System.out.println(message);
//        System.out.println(args[0]);

        // dropdown =>  scanner / db
        PrintMessage p1 = new PrintMessage(new DBInputSource());
        p1.print();

        InputSource source = new FileInputSource();
        source.m1();
        source = new ScannerInputSource();
        source.m1();
    }
}
