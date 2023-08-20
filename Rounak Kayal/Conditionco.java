import java.util.Scanner;
public class Conditionco
{
    public static void main(String[] args)
    {
        System.out.println("Enter your age : ");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>17)
        {
            System.out.println("Give vote");
        }
        else
        {
            System.out.println("Don't give vote, go to home kid!");
        }
    }
}

