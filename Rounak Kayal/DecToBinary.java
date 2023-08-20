// convert a decimal number to its binary 

import java.util.*;

public class DecToBinary
{
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int n = sc.nextInt();
        String b = "";

        while(n>0)
        {
            int r = n%2;
            n = n/2;
            b = r + b;
        }

        System.out.println(b);
    }
}
