import java.util.*;
public class operators {

    public static void main(String[]args){
    Scanner sc  =new Scanner (System.in);
    //int n=sc.nextInt(); 
    /*right shift 
    int n=5;
    int pos =3;
    int Bitmask =1<<pos;
    if((Bitmask & n )== 0){
        System.out.println("zero");
    }   else{
        System.out.println("not zero");
    }*/
    /*SET BIT 
    int n =5;
    int pos =1;
    int bitmask =1<<pos;
    int newnumber=bitmask|n;
    System.out.println(newnumber);
    */
   /* CLEAR bit MAsk
    int n =5;
    int pos =2;
    int bitmask =1<<pos;
    int Notbitmask=~(bitmask);
    int newnumber=Notbitmask&n;
    System.out.println(newnumber);
    */
    int oper =sc.nextInt();
    //oper=1:set, oper=0: clear
    int n =5;//0101 ->
    int pos =1;
    int bitmask =1<<pos;
    if(oper==1){
        //set
        int newnumber= bitmask|n;
        System.out.println(newnumber);
    }else{
    int newbitmask=~(bitmask);
    int newnumber=newbitmask&n;
    System.out.println(newnumber);
    }

    }
}
