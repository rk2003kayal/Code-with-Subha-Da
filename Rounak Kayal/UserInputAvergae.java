// take 10 user inputs and calculate the average

import java.util.*;

public class UserInputAvergae
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int [10];

        System.out.println("Enter array elements - ");

        for(int i = 0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("The array is - ");
        for(int i = 0; i<a.length; i++)
        {
            System.out.println(a[i] + " ");
        }

        int sum = 0;
        {
            for(int x:a)
            sum += x;
        }

        System.out.println("The average is = " + (sum/10));
    }
}
