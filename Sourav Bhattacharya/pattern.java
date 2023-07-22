import java.util.Scanner;
public class pattern {
    public static void main(String args[]){
        //*******solid RECTANGLE*******
        /*int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of rows: ");
        a=sc.nextInt();
        System.out.print("enter number of columns: ");
        b=sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }*/
        //HOLLOW RECTANGLE
        /*int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of rows: ");
        a=sc.nextInt();
        System.out.print("enter number of columns: ");
        b=sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                //cell -> (i,j)
                if(i== 1 || j==1 || i==a || j==b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        //*******HALF PIRAMIND********
        /*int a;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of rows for making right traingle: ");
        a=sc.nextInt(); 
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }*/
        //reverse half pyramids
        /*int a;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of rows for making reverse half pyramids: ");
        a=sc.nextInt(); 
        for(int i=a; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }*/
        //iverted half pyramid(rotated by 180 deg)
        /*int a;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of rows for making iverted half pyramids: ");
        a=sc.nextInt(); 
        for(int i=1; i<=a; i++){
            //inner loop for space print 
            for(int j=1; j<=a-i; j++){
                System.out.print(" ");
            }
            //inner loop for print star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            } 
            System.out.println();   
        }*/
        //half pyramid with numbers 
        /*int a; 
        Scanner sc =new Scanner(System.in);
        System.out.print("enter  number of rows for making half pyramids with numbers: ");
        a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
        //iverted half pyramid with numbers 
        /*int a; 
        Scanner sc =new Scanner(System.in);
        System.out.print("enter  number of rows for making inverted half pyramids with numbers: ");
        a=sc.nextInt();
        for(int i=1;i<=a;i++){              //if we put i=0; in first for loop 
            for(int j=1;j<=a-i+1;j++){      //then in second for loop j<=a-i;
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
        //FLOYD'S Triangle
        /*int a; 
        int num=1;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter  number of rows for making FLOYD'S Triangle: ");
        a=sc.nextInt();
        for(int i=1;i<=a;i++){     //outer loop for count the number of rows              
            for(int j=1;j<=i;j++){    //inner loop print the numbers = the rows number  
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }*/
        //0-1 Triangle
        /*int a; 
        Scanner sc =new Scanner(System.in);
        System.out.print("enter  number of rows for making 0-1 Triangle: ");
        a=sc.nextInt();
        for(int i=1;i<=a;i++){              
            for(int j=1;j<=i;j++){      
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }*/ 
        //BUTTERFLY PATTERN
        /*int a; 
        Scanner sc =new Scanner(System.in);
        System.out.print("enter  number of rows for making BUTTERFLY PATTERN: ");
        a=sc.nextInt();
        //upper half
        for(int i=1;i<=a;i++){                     //outer loop for number of rows
            for(int j=1;j<=i;j++){                 //inner loop for 1st part stars
                System.out.print("*");
            }
            int space=2*(a-i);
            for(int j=1;j<=space;j++){                 //inner loop for spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){                 //inner loop for 2st part stars
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half 
        for(int i=a;i>=1;i--){                     //outer loop for number of rows
            for(int j=1;j<=i;j++){                 //inner loop for 1st part stars
                System.out.print("*");
            }
            int space=2*(a-i);
            for(int j=1;j<=space;j++){                 //inner loop for spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){                 //inner loop for 2st part stars
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*int a;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of rows: ");
        a=sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=a; j++){
                //if(i== 1 || j==1 || i==a || j==b){       //for hollow rhambus
                   // System.out.print("*");
                //}else{
                    //System.out.print(" ");
               // }
                System.out.print("* ");  
            }
            System.out.println();

        }*/
        //Number Pyramid
        /*int a;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of rows: ");
        a=sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=(a-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");  
            }
            System.out.println();

        }*/
        //Palindromc pattern
        int a;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of rows: ");
        a=sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=(a-i); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);  
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);  
            }
            System.out.println();

        }
        //Diamond
        /*int a;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of rows: ");
        a=sc.nextInt();
        //upper half
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            } 
            
            System.out.println();
        } 
        //lower half   
        for(int i=a; i>=1; i--){      
            for(int j=1; j<=a-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            } 
            System.out.println();
        }*/        
    } 
}


