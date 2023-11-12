public class StudentTest {    
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        System.out.println(s.name + " " + s.age);
        Student b = new Student();
        b.name = "Jason";
        b.age = 19;
        System.out.println(b.name + " " + b.age);
        b.displayAge();
        b.sayHello();
    }
   
}
