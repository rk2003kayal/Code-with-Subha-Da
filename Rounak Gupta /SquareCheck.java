import java.util.Scanner;
class SquareCheck
{
  public static void main(String[]args)
 {
     System.out.println("Enter the length of the rectangle");
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  
  System.out.println("Enter the breadth of the rectangle");
  int b = sc.nextInt();
  if(a==b)
  {
    System.out.println("It is a Square" );
  }
  else
  {
    System.out.println("It is not a Square");
  }
  }
}
