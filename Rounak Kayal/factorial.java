// factorial of a number

import java.util.*;

public class factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no - ");
        int num = sc.nextInt();

        int fact = 1;
        for(int i = 1; i <= num; i++)
        {
            fact = fact*i;
            // fact is just used as a variable 
        }

        System.out.println("Factorial of " +num+ " is : " +fact);
    }
}
