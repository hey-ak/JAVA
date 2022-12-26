import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        // System.out.println("Enter m");
        // int m = sc.nextInt();

        // question 1- rectangle pattern
        // for (int i =1; i <=n; i++) {
        // for (int j = 0; j <=m; j++) {
        // System.out.print("*");

        // }
        // System.out.println();

        // }
        // Question -2 Hollow Rectangle
        // for (int i =1; i <=n; i++) {
        // for (int j = 1; j <=m; j++) {
        // if (i==1||i==n||j==1||j==m) {
        // System.out.print("*");

        // }
        // else{
        // System.out.print(" ");
        // }

        // }
        // System.out.println();

        // }
        // Question-3 Pyramid Problem
        // for (int i =1; i <=n; i++) {
        // for (int j = 1; j <=i; j++) {

        // System.out.print("*");

        // }
        // System.out.println();

        // // }
        // // System.out.println();

        // // }
        // }
        // Question -5
        // Invert Pyramid
        // for (int i =n; i >=1; i--) {
        // for (int j = 1; j <=i; j++) {

        // System.out.print("*");

        // }
        // System.out.println();
        // }
        // Question -6 Half Pyramid 180 degree
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <=n - i; j++) {
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
