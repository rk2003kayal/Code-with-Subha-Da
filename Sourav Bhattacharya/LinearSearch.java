import java.util.Scanner;

public class ClassProg {
    public static void main(String[] args) {
        int size,n,count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size: ");
        size=s.nextInt();
        int[] a=new int[size];
        System.out.print("Elements: ");
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        System.out.print("printed array element: ");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nEnter the search element: ");
        n=s.nextInt();
        for(int i=0;i<size;i++){
            if(a[i]==n){
                count++;
            }
        }
        if(count>0){
            System.out.println("element found "+count+" times");
        }else{
            System.out.println("element not found");
        }
    }
}
