import java.util.Scanner;
// Question 1 Sum of Two Numbers Using functions
public class SumFunc {
    public static int calSum(int a,int b){
     int sum = a+b;
     return sum;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Number 1");
     int n1= sc.nextInt();
     System.out.println("Enter Number 2");
     int n2= sc.nextInt();
     System.out.println("The Sum is "+ calSum(n1, n2));


        
    }
}
