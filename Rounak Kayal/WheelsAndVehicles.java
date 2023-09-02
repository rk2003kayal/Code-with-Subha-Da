// An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

import java.util.*;

public class WheelsAndVehicles
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();
        int Fw = (w - 2*v)/2;
        int Tw = v - Fw;

        if(w>=2 && (w%2 == 0) && v<w)
        {
            System.out.println("TW " +Tw+ " Fw " +Fw);
        }
        else
        {
            System.out.println("INVALID OUTPUT");
        }
    }
}
