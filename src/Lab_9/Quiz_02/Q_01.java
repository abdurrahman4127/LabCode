package Lab_9.Quiz_02;

import java.util.*;

public class Q_01 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            checker(a, b);
        }

        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checker(int a, int b)
    {
        if (a > 100) {
            throw new InputMismatchException();
        }
        else if(a < 100)
            System.out.println("the quotient (result of division) by 100 : " + (a / 100));

        if(b > 100){
            throw new InputMismatchException();
        }
        else if(b < 100)
            System.out.println("the quotient (result of division) by 100 : " + (a / 100));
    }
}