package Lab_7.FromClass;

public class ThrowsExample {
    public static void main(String[] args)
    {
        int output = 0;

        try{
            output = divide(3,0);
        }
        catch(Exception e)
        {
            System.out.println("Exception Found! " + e);
        }

        System.out.println("Output is: " + output);
    }

    //this method might/can return an exception
    public static int divide(int a, int b) throws ArithmeticException
    {
        return (a / b);
    }
}
