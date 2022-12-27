/**
 * AdvPatterns
 */
import java.util.Scanner;
public class AdvPatterns {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number");
        int n= sc.nextInt();
        // Question-1 Butterfly Pattern
        for (int i = 1; i <=n; i++) {
            // for stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            // for spaces
            int spaces=2*(n-i);
            for (int k = 0; k <=spaces; k++) {
                System.out.print(" ");
                
            }
            // for stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        // for second half
        for (int i = n; i>=1; i--) {
            // for stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            // for spaces
            int spaces=2*(n-i);
            for (int k = 0; k <=spaces; k++) {
                System.out.print(" ");
                
            }
            // for stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }

    }

}