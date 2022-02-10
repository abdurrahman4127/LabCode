package Lab_8;

import java.io.*;

public class FileWriterWithBufferedWrite {
    public static void main(String[] args)
    {
        try(BufferedWriter bfrw = new BufferedWriter(new FileWriter("C:\\Users\\USER\\LabCode\\src\\Lab_8\\hello3.txt", true)))
        {
            String line = "Hello Universe!";
            String line2 = "Bye Universe!";

            bfrw.write(line);
            bfrw.write(line2);
            bfrw.newLine();

            System.out.println("File Written Successfully");
            bfrw.close();
        }
        catch(Exception e)
        {
            System.out.println("Error in File Writing " + e);
        }
    }
}
