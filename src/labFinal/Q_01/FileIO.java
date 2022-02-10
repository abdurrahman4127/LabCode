package labFinal.Q_01;

import java.io.*;

public class FileIO {
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\MC\\LabCode\\src\\labFinal\\Q_01\\MyFile.txt");
        try {
            FileReader reader = new FileReader(file);
            FileWriter writer = new FileWriter("C:\\Users\\MC\\LabCode\\src\\labFinal\\Q_01\\Written.txt",true);

            int txt;
            while ((txt = reader.read()) != -1)
            {
                writer.write(txt);
            }

            reader.close();
            writer.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}