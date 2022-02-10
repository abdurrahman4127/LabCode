package Lab_8;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) throws FileNotFoundException
    {
        //using BufferReader to read

        try {
            FileReader fileReader = new FileReader("hello.txt");
//            BufferReader bufferReader = new BufferReader();
        }
        catch (FileNotFoundException  e){
            System.out.println("error in file reader");
        }
    }
}
