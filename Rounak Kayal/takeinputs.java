// Take 10 integer inputs from user and store them in an array and print them on screen.

import java.util.*;

public class takeinputs
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        int [] a = new int[10];

        System.out.println("Enter array elements");
        
        for(int i=0; i<a.length; i++)        
        {
            a[i] = x.nextInt();
        }
            
        System.out.print("The array is ");

        for(int i = 0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
