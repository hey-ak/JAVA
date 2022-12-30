import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //  concatenation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name");
        String Fname = sc.nextLine();
        System.out.println("Enter Your Last Name");
        String Lname = sc.nextLine();
        String Fullname=Fname+" "+Lname;

        System.out.println("Your Name is "+ Fullname);
        System.out.println(Fullname.length());
        // CharAt
        for (int i = 0; i <Fullname.length(); i++) {
            System.out.println(Fullname.charAt(i));
            
        }

    

        
    }
    
}
