package interfaces;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileInputSource implements   InputSource{

    public String getMessage() throws IOException {
        FileReader reader = new FileReader("demo.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String message = bufferedReader.readLine();
        reader.close();
        bufferedReader.close();
        return message;
    }

    @Override
    public void m1() {
        System.out.println("m1 file input source");
    }
}
