// code to find smallest element in array 

import java.util.*;

public class smaLLest1
{
    public static void main(String[] args)
    {
        int a[] = new int [5];
        int min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        for(int i = 0; i<5; i++)
        {
            a[i] = sc.nextInt();
        }
        min = a[0];
        for(int i = 0; i<5; i++)
        {
            if(a[i] < min)
            {
                min = a[i];
            } 
        }
        System.out.println("Smallest element is : " +min);
    }
} 
