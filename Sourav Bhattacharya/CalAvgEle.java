import java.util.Scanner;

public class CalAvgEle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter size: ");
        int n=s.nextInt();
        int[] array=new int[n];
        System.out.print("Elements: ");
        for(int i=0;i<n;i++){
            array[i]=s.nextInt();
            sum=sum+array[i];
        }
        float temp=sum/n;
        System.out.println("\nAverrage: "+temp);
    }    
}
