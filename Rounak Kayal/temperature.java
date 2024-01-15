import java.util.*;

public class temperature
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("TEMPERATURE CONVERTOR");
        System.out.println("To convert C to F, press 1");
        System.out.println("To convert F to C, press 2");
              
        int temp = sc.nextInt();

        if(temp == 1)
        {
            System.out.println("Enter temperature in Celsius");
            double c = sc.nextDouble();
            double f = (c * 9/5) + 32;
            System.out.println(f);
        }

        else
        {
            System.out.println("Enter temperature in Farenheit");
            double f = sc.nextDouble();
            double c = (f - 32) * 5/9;
            System.out.println(c);
        }
    }
}
