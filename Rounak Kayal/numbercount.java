import java.util.*;

public class numbercount
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) != ' ')
            count++;
        }

        System.out.println("Number of digits are : " +count);
    }
}
