import java.util.Scanner;
class LargestNumber
{
  public static void main(String[]args)
 {
     System.out.println("Enter the first number");
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  
  System.out.println("Enter the second number");
  int b = sc.nextInt();
  if(a>b)
  {
    System.out.println(a+ " is the larger number" );
  }
  else
  {
    System.out.println(b+ " is the larger number");
  }
  }
}
