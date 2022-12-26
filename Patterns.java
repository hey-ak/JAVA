import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter m");
        int m = sc.nextInt();
        

        for (int i =1; i <=n; i++) {
            for (int j = 0; j <=m; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }
}
