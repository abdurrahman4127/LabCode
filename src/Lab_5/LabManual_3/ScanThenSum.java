package Lab_5.LabManual_3;

import java.util.Scanner;

public class ScanThenSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter 1st number : ");
        double num1 = scanner.nextDouble();

        System.out.println("enter 2nd number : ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;

        System.out.println("sum : " + num1 + " + " + num2 + " = " + sum);
    }
}
