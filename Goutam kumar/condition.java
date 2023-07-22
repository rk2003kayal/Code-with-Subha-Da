import java.util.Scanner;

public class condition{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   //checking  num is even or odd
    /*int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    if( num1%2==0){
        System.out.println("input  is even");
    }
    else {
            System.out.println( " input is odd"); 
        }*/
      // cgeckin condition =,>,<  
    /*
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    if( num1==num2){
        System.out.println("equal");
    }
    else {
        if (num1>num2) {
        System.out.println(" num1 is greater");
        
    } else {
        System.out.println("num1 is lesser");
        
    } 
6
    }*/

    //for many input like switch board
/*
int button = sc.nextInt();
switch(button){
    case 1: System.out.println("Ram Ram");
    break;
    case 2: System.out.println("Radhe Radhe");
    break;
    case 3: System.out.println("Jai Shree Ram");
    break;
    default:System.out.println("invaid button"); 

}*/
//sum of n natural number
/*int n = sc.nextInt();

int mult = 0;
    for(int i=0;i<11;i++){
        mult = n*i ;
        System.out.println(mult);
    }*/
    
//nested pattern
    /*int n =sc.nextInt();
    int m =sc.nextInt();

    for( int i=0; i<n; i++){
    System.out.println();

    for(int j=0; j<=m ;j++){
    System.out.print("*");
    

    }
}*/
//for****
     //****
     //*  *
     //****
/*int n =4;
int m = 5;

for(int i=1; i<=n; i++){
    
    for( int j=1; j<=m ;j++){
        
        
        if (i==1||j==1||i==n||j==m) {
            System.out.print("*");
            
        } else {
            System.out.print(" ");
        }
    }
            
    System.out.println();
}*/
//half pyramid
/* 
int n =4;
int i;
for ( i=1; i<=n; i++ ){
    

for(int j=1; j<=i; j++){
    System.out.print("*");
    
}
System.out.println();
}*/
/* 
int n=4;
int i;
int j;
for(i=1;i<=n;i++){
}

    for(j=1; j<=n-i ;j++){
        System.out.print(" ");
    }
   
    
        for(j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
*/
/* 
//1
2 3 
4 5 6 
7 8 9 10

int n=5;
int number= 1;
int i;
int j;
  
 for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        System.out.print(number+" ");
        number++;

    }
    System.out.println();
 }*/



/* 
int n=5;
int number=1;
int i;
int j;
for (i=1; i<=n;i++){
    for(j=1;j<=i;j++){
     System.out.print(number%2+" ");
     number++;
    }
    
        System.out.println();
     }*/



     /* 
.    .
..  ..
......
..  ..
.    .

    int n =4;
    int i ;
    int j;
    for(i=1;i<=n;i++){
        for(j=1; j<=i; j++){
            System.out.print("*");
        }
     int spaces= 2*(n-i);
        for( j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();

    }
    for(i=n;i>=1;i--){
        for(j=1; j<=i; j++){
            System.out.print("*");
        }
     int spaces= 2*(n-i);
        for( j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();

    }*/

 
    }
}




    





        
        

        



    

    





    
    

    

