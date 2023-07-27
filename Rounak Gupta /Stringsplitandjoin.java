import java.io.*;
import java.util.*;

public class Stringsplitandjoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        

        String[] words = inputString.split(" ");
        String line=String.join("-" , words);
        System.out.println(line);
            }
}
