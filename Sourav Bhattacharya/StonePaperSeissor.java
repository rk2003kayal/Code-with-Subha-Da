import java.util.Random;
import java.util.Scanner;

public class RockPaperSeissor{
    public static void main(String[] args) {
        /*for rock=R
         * paper=P ,seissor=S
         */
        Scanner s=new Scanner(System.in);
        double compurter_choice=Math.random()*3;
        int val=(int)compurter_choice;
        System.out.println("****ROCK-PAPER-SEISSOR****\nRock = 1\nPaper = 2\nSeissor = 3");
        System.out.println("Enter to start Rock Paper Seissor");
        int n=s.nextInt();
        switch(n){
            case 1:
                System.out.println("you choose rock");
                break;
            case 2:System.out.println("you choose paper");
                break;
            case 3: System.out.println("you choose seissor");
                break; 
            default:System.out.println("choose valid input"); 
                break;  
        }
        switch(val){
            case 1:
                System.out.println("computer choose rock");
                break;
            case 2:System.out.println("computer choose paper");
                break;
            case 3: System.out.println("computer choose seissor");
                break; 
            default:
                break;
        }        
        if(n<=3){
            if(val==1 && n==2){
                System.out.println("you won\nCongrats!!!!!");
            }else if(val==2 && n==3){
                System.out.println("you won\nCongrats!!!!!");
            }else if(val==3 && n==1){
                System.out.println("you won\nCongrats!!!!!");
            }else if(val==n){
                System.out.println("the match is tie......");
            }else{
                System.out.println("computer won\nBetter luck next time.....");
            }
        }else{
            System.out.println("invalid input,game cant proceed");
        }
        System.out.println("play again????\nYES for 1\nNO for 2");
        int p=s.nextInt();
        again(p);
    }
    public static void again(int p){
        if(p==1){
            main(null);;
        }
        else{
            System.out.println("see later...");
            return;
        }
    }
}
