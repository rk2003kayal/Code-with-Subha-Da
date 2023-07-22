import java.util.*;
public class patterns{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //int n= 5;
        //int i;
        //int j;
        /*
        for( i=1;i<=n;i++){
            
            for( j=1;j<=n-i; j++){
                System.out.print(" ");

            }
           for(j=1;j<=n;j++){
            System.out.print("*");
           } 
           System.out.println();

        }*/
/* 
    for(i=1;i<=n;i++){
        for(j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(j=1;j<=i;j++){
            System.out.print(i+"  ");

        }
        System.out.println();

    }*/
    /* 
    int n=5;
    int d=9;
    for(int i=1; i<=n; i++){
        
    for(int j=0 ;j<=d;j++);{

        System.out.print("*");
    }
    System.out.println("Goutam");
    
}*/

int n=sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=0;j<=n-i;j++){
        System.out.print("*");
    }
    System.out.println( );
    }



    }
}