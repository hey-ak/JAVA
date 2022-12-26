import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num 1");
         Float num1= sc.nextFloat();
        System.out.println("Enter Num 2");
         Float num2= sc.nextFloat();
         System.out.println("Enter 1 for Add, 2 for Substract 3 for Multiply and 4 For Division");
         int op= sc.nextInt();
         switch (op) {
            case 1: System.out.println(num1+num2);
            break;
            case 2: System.out.println(num1-num2);
            break;
            case 3: System.out.println(num1*num2);
            break;
            case 4: System.out.println(num1/num2);
            break;
         
            default:
                
         }






    }
}
