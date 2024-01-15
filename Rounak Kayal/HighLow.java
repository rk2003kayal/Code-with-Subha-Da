// arrange array elements in ascending order and then in descending order

import java.util.*;

public class HighLow
{
    public static void main(String[] args) 
    {
        int size;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        size = sc.nextInt();

        int a[] = new int[size];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) 
        {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        System.out.println("Array elements in ascending order:");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < size / 2; i++) 
        {
            int temp = a[i];
            a[i] = a[size - 1 - i];
            a[size - 1 - i] = temp;
        }

        System.out.println("\nArray elements in descending order:");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(a[i] + " ");
        }
    }
}




//Enter array size: 6
//Enter array elements:
//1 423 45 323 89 3
//Array elements in ascending order:
//1 3 45 89 323 423 
//Array elements in descending order:
//423 323 89 45 3 1 
