package Lab_9.Quiz_02.Quiz_02_Soln;

public class Q2 {
    public static void testMethod(int num) throws Exception
    {
        if(num < 0)
        {
            throw new Exception();
        }
        else
        {
            if(num % 3 == 0)
                System.out.println(num + " is a multiple of 3");
        }
    }

    public static void main(String[] args) {
        try
        {
            testMethod(-12);
        } catch (Exception e) {
            System.out.println("Negative number passed as parameter.");
        }
    }
}
