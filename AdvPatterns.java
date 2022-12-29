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
        // for (int i = 1; i <=n; i++) {
        //     // for stars
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print("*");
                
        //     }
        //     // for spaces
        //     int spaces=2*(n-i);
        //     for (int k = 1; k <=spaces; k++) {
        //         System.out.print(" ");
                
        //     }
        //     // for stars
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print("*");
                
        //     }
        //     System.out.println();
            
        // }
        // // for second half
        // for (int i = n; i>=1; i--) {
        //     // for stars
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print("*");
                
        //     }
        //     // for spaces
        //     int spaces=2*(n-i);
        //     for (int k = 1; k <=spaces; k++) {
        //         System.out.print(" ");
                
        //     }
        //     // for stars
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print("*");
                
        //     }
        //     System.out.println();
            
        // }
        // Question -2 Rhombus Pattern
        //  for (int i = 1; i <=n; i++) {
        //     // spaces
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" ");
                
        //     }
        //     // stars
        //     for (int j = 1; j <=5; j++) {
        //         System.out.print("*");
                
        //     }
        //     System.out.println();
            
        //  }
        // Questions-3 Number Pattern Pyramid
        // for (int i = 1; i <=n; i++) {
        //     //spaces
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     // numbers
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(i +" ");
                
        //     }
        //     System.out.println();

            
        // }
        // Question -4 Palindromic Pattern
        // for (int i = 1; i <=n; i++) {
        //     // spaces
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" ");
                
        //     }
        //     // Forward number pattern
        //     for (int j = i; j >=1; j--) {
        //         System.out.print(j);
                
        //     }
        //     //Backward number pattern
        //     for (int j = 2; j <=i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();

            
        // }
        // Question -5 Diamond Pattern
        // uper half
        for (int i = 1; i<=n; i++) {
            // spaces
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
                
            }
            // stars
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        // lower half
        for (int i = n; i>=1; i--) {
            // spaces
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
                
            }
            // stars
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }



    }

}