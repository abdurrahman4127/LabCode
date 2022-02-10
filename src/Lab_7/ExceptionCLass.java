package Lab_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCLass {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int div = a / b;
            System.out.println(a + " / " + b + " = " + div);
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
