import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Conditionals {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
   System.out.println("Enter The Number");
      int button=sc.nextInt();
    //   System.out.println("Enter The Number 2");
    //   int y=sc.nextInt();
//       if (age>18) {
//         System.out.println("You Can Drive");

//       }
//       else if (age==18) {
//         System.out.println("You are an Adult Now");
        
//       }
//      else{
//         System.out.println("You are Not an Adult So You Can't Drive");
//      }
   
// if (x%2==0) {
//     System.out.println("Even");
    
// }else{
//     System.out.println("Odd");
// }
// if (x>y) {
//     System.out.println("Num 1 is Greater");
    
// }
// else if(x==y){
//     System.out.println("Num1 and Num2 are Equal");
// }
// else{
//     System.out.println("Num1 is Lesser");
// }
switch (button) {
    case 1: System.out.println("Namaste");
        break;
        case 2: System.out.println("Hello");
        break;
        case 3: System.out.println("Bonjour");
        break;

    default: System.out.println("Invalid");
        break;
}



    }
}
