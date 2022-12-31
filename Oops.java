// class Pen{
//     String color;
//     String type;
//     // methods
//     public void printColor(){
//         System.out.println(this.color);
//     }
//     public void printType(){
//         System.out.println(this.type);
//     }
// }
class Student{
    String name;
    int age;

    // method
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
}







public class Oops {
    public static void main(String[] args) {
        // Pen pen1= new Pen();
        // pen1.color="Blue";
        // pen1.type="Ballpoint";
        // pen1.printColor();
        // Pen pen2= new Pen();
        // pen2.color="Red";
        // pen2.type="Gel";
        // pen2.printColor();
        Student s1=new Student();
        s1.name="Akshay";
        s1.age=19;
        s1.printInfo();

    }
    
}
