// A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. Ask user for their salary and year of service and print the net bonus amount.

//code :-

import java.util.*;

public class salarybonus
{
    public static void main(String[] args)
    {
        System.out.println("For how many years are you working with our company?");
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();

        if(years>=5)
        {
            System.out.println("You are eligible for 5% bonus.");

            System.out.println("Enter your salary - ");
            int salary = sc.nextInt();
            System.out.println("Your total salary is " +(salary+(salary*0.05))+ "0 INR.");
        }
        else
        {
            System.out.println("Sorry, You are not eligible. Keep the consistency for more " +(5 - years)+ " years !!");
        }
    }
}
