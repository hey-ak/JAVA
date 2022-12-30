import java.util.Scanner;

public class BitManupulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        System.out.println("Enter Position");
        int pos= sc.nextInt();
        int bitmask= 1<<pos;
        if ((bitmask & n)==0) {
            System.out.println("Bit Was Zero");
            
        }
        else{
            System.out.println("Bit Was One");
        }

    }
    
}
