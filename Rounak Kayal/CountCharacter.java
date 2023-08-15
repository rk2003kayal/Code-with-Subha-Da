// counting no of characters in a sentence 

import java.util.*;

public class CountCharacter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String str = sc.nextLine();

        int count = 0;

        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) != ' ')
            count++;
        }

        System.out.println("Total no. of characters in a string : " +count);
    }
}

// SAMPLE of OUTPUT
// 1
// Enter a sentence : 
// rounak kayal
// Total no. of characters in a string : 11
// 2
// Enter a sentence : 
// 123rounak
// Total no. of characters in a string : 9
