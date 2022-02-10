package Lab_9.Quiz_02.Quiz_02_Soln;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); //taking first input

        try
        {
            if(num1 > 100)
            {
                throw new InputMismatchException();
            }
            /* else is not necessary here */
        }
        catch (InputMismatchException e)
        {
            /* converting */
            num1 = num1/100;
        }

        int num2 = sc.nextInt(); //taking second input
        try
        {
            if(num2 > 100)
            {
                throw new InputMismatchException();
            }
            /* else is not necessary here */
        }
        catch (InputMismatchException e)
        {
            /* converting */
            num2 = num2/100;
        }

        /*comparing to determine which one is greater*/
        if(num1 > num2)
            System.out.println("Larger number is " + num1);
        else
            System.out.println("Larger number is " + num2);
    }
}
