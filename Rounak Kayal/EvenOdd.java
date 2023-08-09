// Write a program to check whether a number is even or odd

// code :-

import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        System.out.println("Enter any no :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a%2 == 0)
        {
            System.out.println(a + " is even number.");
        }
        else
        {
            System.out.println(a + " is not an even number. " +(a)+ " is odd number.");
        }
    }
}

