//Calculator 

// code:-

import java.util.Scanner;

public class CALCULATOR
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no. :");
        double a = sc.nextDouble();

        System.out.println("Enter second no. :");
        double b = sc.nextDouble();

        System.out.println("Enter the operation : +, -, *, / ");
        char c = sc.next().charAt(0);

        if(c == '+')
        {
            System.out.println("The entered operation is ADDITION and the result is " +(a + b)+ ".");
        }
        else if(c == '-')
        {
            System.out.println("The entered operation is SUBTRACTION and the result is " +(a - b)+ ".");
        }
        else if(c == '*')
        {
            System.out.println("The entered operation is MULTIPLICATION and the result is " +(a * b)+ ".");
        }
        else if(c == '/')
        {
            System.out.println("The entered operation is DIVISION and the result is " +(a / b)+ ".");
        }

    }
}

// THANKS FOR WATCHING. GOOD NIGHT
