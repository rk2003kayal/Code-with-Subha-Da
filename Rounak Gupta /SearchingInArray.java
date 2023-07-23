import java.util.Scanner;
public class SearchingInArray
{
	public static void main(String[] args) 
	{
	    int size,i,n,count=0;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		size=sc.nextInt();
		int a[]=new int[size];
		for(i=0;i<size;i++)
		{
		    a[i]=sc.nextInt();
		}
		System.out.println("Prited Array element ");
		for(i=0;i<size;i++)
		{
		    System.out.println(a[i] +" ");
		}
		System.out.println("Enter the Search element");
		n=sc.nextInt();
	    for(i=0;i<size;i++)
	    {
	        if(a[i]==n)
	        {
	            count++;
	        }
	    }
	    if(count>0)
	    System.out.println(" Item Found! " +count+" Time ");
	    else
	    System.out.println("Item NOT Found!");
		}
}
