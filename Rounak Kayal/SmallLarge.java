import java.util.*;

public class SmallLarge
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        
        for(int i = 0; i<a.length; i++)
        {
            System.out.println("Enter the value of a["+i+"]");
            a[i] = sc.nextInt();
        }

        int largest = a[0];
        int smallest = a[0];

        for(int i = 0; i<a.length; i++)
        {
            if(a[i]>largest)
            {
                largest = a[i];
            }
            
            if (a[i]<smallest)
            {
                largest = a[i];
            }

            System.out.println("Largest is " +largest);
            System.out.println("Smallest is " +smallest);
        }
    }
}
