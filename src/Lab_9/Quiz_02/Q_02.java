package Lab_9.Quiz_02;

public class Q_02 {
    public static void main(String[] args)
    {
        try {
            int num = -1;
            int ans = testMethod(num);

            if(ans == 1)
                System.out.println(num + " is a multiple of 3");
            else
                System.out.println(num + " ain't a multiple of 3");
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static int testMethod(int num) throws Exception {
        if(num < 0)
            throw new Exception("you should've gone for a positive integer");
        else if(num % 3 == 0){
            return 1;
        }
        else return 0;
    }
}
