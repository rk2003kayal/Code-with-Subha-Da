// take user input of 10 array elements and add the elements


import java.util.*;

public class UserInputSum
{
    public static void main(String[] args)
    
 {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];

    System.out.println("Enter array elements ");

    for(int i = 0; i<a.length; i++)
    {
        a[i] = sc.nextInt();
    }

    System.out.println("The array is");
    
    for(int i = 0; i<a.length; i++)
    {
        System.out.println(a[i] + " ");
    }

    int sum = 0;
    {
        for(int b:a)
        sum += b;
    }

    System.out.println("The sum is " + sum); 
 }

}
