package Lab_7.FromClass;

public class ExceptionExample {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 2;
        int res = 0;

        try{
            res = a/b; // possible doubtful code that can throw Exception

        }
        catch(Exception e){
            // handle the exception
            System.out.println("Exception Found " + e);

        }

        System.out.println("Result is "+ res);
    }
}
