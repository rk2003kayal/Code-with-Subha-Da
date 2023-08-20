// to count the no of punctuations used in the sentence 

import java.util.Scanner;

public class PunctuationsCount
{
    public static void main(String[] args)
    {
        System.out.println("Enter a sentence : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;

        for(int i = 0 ; i<str.length(); i++)
        {
            if(str.charAt(i) == '!' || str.charAt(i) == '?' || str.charAt(i) == ',' ||str.charAt(i) == '.' ||str.charAt(i) == ';' ||str.charAt(i) == ':' ||str.charAt(i) == '-' ||str.charAt(i) == '\'' ||str.charAt(i) == '\"')
            {
                count++;
            }
        }
        System.out.println("The number of punction marks used are : " +count);
    }
}

// Enter a sentence : 
// how are you?
// The number of punction marks used are : 1
