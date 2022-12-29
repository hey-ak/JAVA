import java.util.Scanner;

public class Factorial {

    public static void Factorial(int n){
        if (n<0) {
        System.out.println("Invalid Number");
        return;
            
        }
        int factorial = 1;
        for (int i = n; i >=1; i--) {
            factorial= factorial*i;
        }
        System.out.println("The Facorial Of "+n+" is "+factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n1 = sc.nextInt();
        Factorial(n1);
        
    }
    
}
