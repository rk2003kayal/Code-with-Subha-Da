import java.util.Scanner;
public class loops{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //*******for loops*********
        /*int counter,a;
        System.out.println("enter the number whose table you need ");
        a = sc.nextInt(); 
        for(counter=0;counter<=10;counter ++){
            int p=counter*a;
            System.out.println(p);

        }*/
        //*******while loops*******
        /*int p, c;
        System.out.println("enter the number whose table you need ");
        c= sc.nextInt();
        int i=0;
        while(i<=10){
            p=c*i;
            System.out.println(p);
            i++;
        }*/
        //******do while loops********* 
        /*System.out.println("enter the number whose table you need ");
        int p, c,i=0;
        c= sc.nextInt();
        do{
            p=c*i;
            System.out.println(p);
            i++;
        }while(i<=10);*/
        //print sum of the first n natural number 
        int p=0,i,a,fact=1;
        System.out.print("enter first N natural number: ");
        a = sc.nextInt(); 
        sc.close();
        System.out.print("the number from 1 to "+a+" are : ");
        for(i=1;i<=a;i++){
            System.out.print(" "+i);
            
            fact=fact*i;
            p=p+i;
        }  
        System.out.println("\nsum = "+p);
        System.out.println("the factorial of this entered number is :"+fact);
        
    }   
}
