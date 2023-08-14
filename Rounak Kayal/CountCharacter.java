// counting no of characters in a sentence 

public class CountCharacter
{
    public static void main(String[] args)
    {
        String str = "All the best";
        int count = 0;

        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) != ' ');
            count++;
        }

        System.out.println("Total no. of characters in a string : " +count);
    }
}
