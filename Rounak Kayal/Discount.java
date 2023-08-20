// A shop will give discount of 10% if the cost of purchased quantity is more than 1000. Ask user for quantity. Suppose, one unit will cost 100. Judge and print total cost for user.

// code :-

import java.util.Scanner;

public class Discount
{
    public static void main(String[] args)
    {
        System.out.println("Enter the price: ");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        if(price>1000)
        {
            System.out.println("Coupon code DIS10PERCENT applied! Your discount is " + (price*0.1) + "0. The final price for you is " + (price-(price*0.1)) + "0 INR !! THANK YOU for shopping with us!");
        }
        else
        {
            System.out.println("Sorry! No coupons available :-( Keep shopping for more " +(1000-price)+ " to get a discount of 10%");
        }
    }
}
