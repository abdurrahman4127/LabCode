package Lab_8.FromClass;

import java.io.*;

public class FileReaderWithBufferedReader {
    public static void main(String[] args)
    {
        try(BufferedReader bfrd = new BufferedReader(new FileReader("C:\\Users\\MC\\LabCode\\src\\Lab_8\\FromClass\\hello3.txt")))
        {
            String line;
            while ((line = bfrd.readLine()) != null)
            {
                System.out.println(line);
            }
            bfrd.close();
        }
        catch (Exception e)
        {
            System.out.println("Error in File Reader " + e);
        }
    }
}