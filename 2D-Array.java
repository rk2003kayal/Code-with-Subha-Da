import java.util.*;
public class twodarr {
    public static void main(String[]args){
        int a[][]=new int [5][6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array element");
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){

                a[i][j]=sc.nextInt();

            }
        }
        System.out.println("Matrix:\n");
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print(" \n");
            
        }
        //***********************TRANSPOSE MATRIX*************************************** */
        System.out.println("Transpose Matrix:\n");
        for(int i=0;i<6;i++){
            for(int j=0;j<5;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.print("\n");
        }
        
        

    }

    
}
