import java.util.Scanner;
import java.lang.String;
public class PalindromeWord{
    public static void main(String[] arges) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a word: ");
        String str=sc.nextLine();
        if(ispalindrome(str)){
            System.out.println(str+" is a palindrome word");
        }
        else{
            System.out.println(str+" is not a palindrome word.");
        }
    }
    public static boolean ispalindrome(String str){
        int left=0,right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--; 
        }
        return true;
    }   

}
