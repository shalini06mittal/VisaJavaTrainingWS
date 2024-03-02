package interfaces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DBInputSource implements   InputSource{

    public String getMessage() throws IOException {

        return "Message from DB";
    }
}
