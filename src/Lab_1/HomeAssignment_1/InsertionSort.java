package Lab_1.HomeAssignment_1;

import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int []arr = {2, 13, 5, 8, 13, 51, 35, 19, 15, 30, 14};

        for(int i=1; i<arr.length; i++)  // iterating from index 1
        {
            int key = arr[i];   // key is the target value that will be compared with
            int j = i - 1;

            while (j >=0 && arr[j] > key)   // arr[j] < key : for ascending sort
            {
                arr[j+1] = arr[j];  // shifting by 1 index
                j = j - 1;          // to include all previous index in comparison
            }
            arr[j+1] = key;     // shifting the target to its correct position
        }

        System.out.println(Arrays.toString(arr));
    }
}
