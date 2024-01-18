import java.util.Scanner;

public class armstrong 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int realno = num;
        int n = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) 
        {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }

        if (sum == realno) 
        {
            System.out.println(realno + " is an Armstrong num.");
        } else 
        {
            System.out.println(realno + " is not an Armstrong num.");
        }

        scanner.close();
    }
}
