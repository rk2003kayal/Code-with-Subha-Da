import java.io.*;
import java.util.Scanner;
import java.math.*;

public class FascinatingNumber {

    public static void main(String[] args) {
        int n, n2, n3;      
    Scanner sc=new Scanner(System.in);  
    n = sc.nextInt();  
    n2 = n * 2;  
    n3 = n * 3;  
  
    String concatstr = n+" "+n2+n3;  
    boolean found = true;  
  
for(char c = '1'; c <= '9'; c++)  
{  
    int count = 0;   
for(int i = 0; i < concatstr.length(); i++)  
{  
    char ch = concatstr.charAt(i);  
 
    if(ch == c)  
  
    count++;  
}  
 
if(count > 1 || count == 0)  
    {  
        found = false;  
        break;  
    }  
}  
if(found)  
System.out.println("Fascinating Number");  
else  
System.out.println("Not Fascinating Number");  
}
}
