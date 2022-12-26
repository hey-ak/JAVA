import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n= sc.nextInt();
        boolean isprime = true;
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                isprime= false;
                break;
                
            }
            
        }
        if (isprime) {
            if (n==1) {
                System.out.println("Neither Prime Nor Composite");
                
            }
            else{
                System.out.println("This is Prime");
            }
            
        }
        else{
            System.out.println("Not Prime");
        }

    }
}
