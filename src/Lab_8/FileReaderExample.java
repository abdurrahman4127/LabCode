package Lab_8;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args)
    {
        //using bufferedReader to read from file
        try {
            FileReader fr = new FileReader("C:\\Users\\USER\\LabCode\\src\\Lab_8\\hello2.txt");
            int i;

            while((i = fr.read())!= -1) {
                System.out.print((char)i);
            }
            //BufferedReader bfrd = new BufferedReader()
        }

        catch (FileNotFoundException e) {
            System.out.println("Error in File Reader " + e);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}