import java.util.*;
public class arrays{
   /* 
        int [] marks =new int[3];
        marks[0]=98;
        marks[1]=97;
        marks[2]=99;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);


    }*/

//****************************************************************************
     
public static void main(String[]args){
    int a[] = new int[5];
    int temp;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter element in array");
    for(int i=0;i<5; i++){
        a[i]=sc.nextInt();
    }
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(a[i]+" ");
        }
    }
}






     
    


