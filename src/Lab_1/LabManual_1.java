package Lab_1;

public class LabManual_1 {
    public static void main(String[] args)
    {
        // printing "Hello World!!"
        System.out.println("Hello World!!" + "\n");

        // first 10 even numbers
        for(int i=0; i<20; i=i+2)
        {
            System.out.println(i);
        }

        System.out.println();

        // finding max
        int []arr = {2, 3, 9, 8, 13, 1, 5, 19, 15, 0, 4};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("max is : " + max);
    }
}
