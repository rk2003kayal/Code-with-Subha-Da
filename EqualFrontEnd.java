// Write a program to check if elements of an array are same or not it read from front or back.

public class EqualFrontEnd
{
    public static void main(String[] args)
    {
        int[] a = {2, 3, 4, 5, 3, 2};
        boolean read = true;
        int j = a.length-1;;

        for(int i = 0; i<a.length/2; i++)
        {
            if(a[i] != a[j])
            {
                read = false;
                break;
            }
            else
            {
                j--;
            }

        }
        System.out.println(read);
    }
}
