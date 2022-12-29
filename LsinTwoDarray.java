import java.util.Scanner;

public class LsinTwoDarray {
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
        System.out.println("Enter The Element You Want To Search  ");
        int key= sc.nextInt();

        // compare
        for (int i = 0; i <row; i++) {
            // columns
            for (int j = 0; j <columns; j++) {
                if (num[i][j]==key) {
                    System.out.println("Element Found at Index ("+i+","+j+")");
                    
                }
                
            }
            
        }
    }
}
