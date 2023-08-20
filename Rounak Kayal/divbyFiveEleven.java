// Write a program to check whether a number is divisible by 5 and 11 or not

// code :-

import java.util.Scanner;

public class divbyFiveEleven
{
    public static void main(String[] args)
    {
        System.out.println("Enter any no :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a%5 == 0 && a%11 == 0)
        {
            System.out.println(a + " is divisible by both 5 and 11.");
        }
        else
        {
            System.out.println(a + " is not divisible by 5 and 11. Try other number! ");
        }
    }
}
