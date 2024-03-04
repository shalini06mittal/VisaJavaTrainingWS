package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowThrowsFinallyDemo {
    /**
     * throws is always used at the method level declaration informing the user of the method
     * that it throws a checked exception
     *
     * throw is a keyword that you use to manually throw an exception
     * @return
     */
    public  static boolean readText() {
        BufferedReader bufferedReader = null;
        boolean res = false;
        try {
            bufferedReader = new BufferedReader(new FileReader("demo.txt"));
            String line = bufferedReader.readLine();
            System.out.println("Line content "+line);
            res =  line.length() > 0;
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
//        catch (FileNotFoundException e) {
////            throw new RuntimeException(e);
//            System.out.println("File does not exist");
//        } catch (IOException e) {
//            //throw new RuntimeException(e);
//            System.out.println("some error while input op");
//        }

        finally {
            System.out.println("closing file");
            try {
                if(bufferedReader!=null) {
                    bufferedReader.close();
                    System.out.println("closed");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return  res;
    }
    // user interface
    public static void calculate(String data){
        try{
            System.out.println(Integer.parseInt(data));
        }finally {
            System.out.println("finally called");
        }
    }
    public static void main(String[] args)  {
            calculate("12");
            //readText();
    }
}
