import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of Array");
        int n1 = sc.nextInt();
        int[] marks= new int[n1];
        // input
        System.out.println("Enter Elements");
        for (int i = 0; i < marks.length; i++) {
            marks[i]=sc.nextInt();
            
        }
        // output
        System.out.println("The Elements Are :");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
            
        }


        
    }
    
}
