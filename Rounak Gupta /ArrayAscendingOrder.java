import java.util.Scanner;
public class ArrayAscendingorder
{
	public static void main(String[] args) 
	{
		int temp;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element in array:");
		
		for(int i=0;i<5;i++)
		{
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
		    for(int j=i+1;j<5;j++)
		    {
		        if(a[i]>a[j])
		        {
		            temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
		        }
		    }
		}
		System.out.println("The array elements in ascending order is:");
		for(int i=0;i<5;i++)
		{
		    System.out.print(a[i]+ " ");
		}
	}
}
