public class Sb {
 public static void main(String[] args) {
    StringBuilder sb= new StringBuilder("Tony");
    // Display Char At 0
    System.out.println(sb);
    // set Index at zero
    sb.setCharAt(0, 'P');
    System.out.println(sb);
    sb.insert(2,'n');
    System.out.println(sb);
    sb.delete(2,3);
    System.out.println(sb);
    sb.delete(2,4);
    System.out.println(sb);
    sb.append("e");
    System.out.println(sb);




 }
    
}
