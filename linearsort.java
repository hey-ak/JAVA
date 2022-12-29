import java.util.Scanner;
public class linearsort {
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
        System.out.println("Enter The Element You want to search");
        int key= sc.nextInt();
        // output
        for (int i = 0; i < marks.length; i++) {
            if (marks[i]==key) {
                System.out.println("Marks Found At Index "+i);
                
            }
          
            
        }
    }
}
