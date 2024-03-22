package interfaces;

import javax.script.ScriptContext;
import java.io.IOException;

public class PrintMessage {

   // FileInputSource inputSource = new FileInputSource();
   // ScannerInputSource inputSource = new ScannerInputSource();
    // has-a, it depends on the object of InputSource
    InputSource inputSource;


    public PrintMessage(InputSource inputSource) {
        this.inputSource = inputSource;
    }

    public  void print() throws IOException {
        System.out.println(inputSource.getMessage());
    }
}
