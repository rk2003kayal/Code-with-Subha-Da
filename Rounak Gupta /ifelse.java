import java.io.*;
import java.util.*;
import java.math.*;
import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(n%2 != 0)
            System.out.println("True");
        else if(n%2 == 0 && n>2 && n<5 )
            System.out.println("Not True");
        else if(n%2 == 0 && n>6 && n<20 )
            System.out.println("True");
        else
            System.out.println("Not True");
    }
}
