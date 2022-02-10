package Lab_3;

import java.util.Scanner;
import javax.swing.*;

public class GUI_Scanner
{
    public static void main(String[] args)
    {
        // JOption PAn takes inputs as string

        String userDoor = JOptionPane.showInputDialog("Enter door num : ");
        String userWindows = JOptionPane.showInputDialog("Enter windows num : ");

        int door = Integer.parseInt(userDoor);
        int windows = Integer.parseInt(userWindows);

        System.out.println("doors : " + door);
        System.out.println("windows : " + windows);

    }
}
