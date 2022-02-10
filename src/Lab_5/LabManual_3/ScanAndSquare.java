package Lab_5.LabManual_3;

import javax.swing.*;

public class ScanAndSquare
{
    public static void main(String[] args)
    {
        double num = Double.parseDouble(JOptionPane.showInputDialog("enter a number : "));
//        System.out.println("square of " + num + " is : " + (num*num));
        JOptionPane.showMessageDialog(null, (num*num));

        /*
        System.out.println("enter a number : ");

        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();

        System.out.println("square of the number is : " + (num * num));

         */
    }
}
