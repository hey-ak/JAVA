import java.util.Scanner;

public class BitManupulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        System.out.println("Enter Position");
        int pos= sc.nextInt();
        // get bit
        int bitmask= 1<<pos;
        
        // if ((bitmask & n)==0) {
        //     System.out.println("Bit Was Zero");
            
        // }
        // else{
        //     System.out.println("Bit Was One");
        // }
        // set bit
        // int newNumber= bitmask |n;
        // System.out.println("The New Number is ");
        // System.out.println(newNumber);
        // clear bit
        int notBitmask= ~(bitmask);
        int newNumber= notBitmask & n;
        System.out.print("The New Number is ");
        System.out.println(newNumber);
       

    }
    
}
