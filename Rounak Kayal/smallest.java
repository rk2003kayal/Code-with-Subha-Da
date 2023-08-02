import java.util.*;

public class smallest
{
    public static void main(String[] args)
    {
        int a[] = new int[5];
        int min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements : ");
        for(int i = 0; i<5; i++)
        {
            a[i]=sc.nextInt();
        }
        min = a[0];
        for(int i = 0; i<5; i++)
        {
            if(a[i] < min)
            {
                min = a[i];
            }
        }
        System.out.println("The smallest element is : " +min);
    }
}
