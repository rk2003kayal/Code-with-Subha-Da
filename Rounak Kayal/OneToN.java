// Write a program to print all natural numbers from 1 to n

import java.util.Scanner;

public class OneToN
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number: ");
        int n = sc.nextInt();
        
        int a;
        for(a = 1; a<=n; a++)
        {
            System.out.println(a);
        }
    }
}
