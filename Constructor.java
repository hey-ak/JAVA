class Student{
    String name;
    int age;
    // methods
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
// parametrized constructor
    Student(String name,int age){
        this.name=name;
        this.age=age;

    }
}



public class Constructor {
    public static void main(String[] args) {
        Student s1= new Student("Akshay", 19);
        s1.printinfo();
        
    }
    
}
