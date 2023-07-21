// to find all pairs of elements in an array whose sum is equal to a specified number in 
// the array
// *confusion

import java.util.*;

public class ArraySumOfPairs 
{
    public static void main(String[] args) 
    {
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size - ");
        size = sc.nextInt();

        int a[] = new int[size];
        System.out.println("Enter the array elements - ");
        for (i = 0; i < size; i++) 
        {
            a[i] = sc.nextInt();
        }

        for (int x = 0; x < i; x++) 
        {
            for (int y = 0; y < i; y++) 
            {
                if (x != y && a[x] + a[y] == a[i]) 
                {
                    System.out.println(a[x] + " + " + a[y] + " = " + a[i]);
                }
            }
        }
    }
}

