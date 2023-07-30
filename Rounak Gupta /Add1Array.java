import java.util.Scanner;

public class Add1Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        
        int[] result = incrementArrayByOne(array);
        
        
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
    
    public static int[] incrementArrayByOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
             if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
