import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Rows");
        int row = sc.nextInt();
        System.out.println("Enter Number Of Columns");
        int columns = sc.nextInt();
        int num[][]= new int [row][columns];
        //input
        // row
        for (int i = 0; i < row; i++) {
            // columns
            for (int j = 0; j < columns; j++) {
                num[i][j]=sc.nextInt();
                
            }
            
        }
        // output
        System.out.println("Output:");
        for (int i = 0; i <row; i++) {
            // columns
            for (int j = 0; j <columns; j++) {
                System.out.print(num[i][j]+" ");
                
            }
            System.out.println();
            
        }

    }
    
}
