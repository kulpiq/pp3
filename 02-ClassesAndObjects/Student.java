public class Student {
    String name;
    int age;
    String id_card;
    boolean valid_id;
    int semester_number;
    float average_grade;

    void sayHello(){
        System.out.println("Hello from "+ name);
    }
    public void displayName(){
        System.out.println(this.name);
    }
    public void displayAge(){
        System.out.println(this.age);
    }
    public void display(){
        System.out.println(name + semester_number + average_grade);
    }
    public void iddisplay(){
        System.out.printf(
            "Name: %s\nCard ID: %s\nCard validity: %s\n",
            this.name,
            this.id_card,
            this.valid_id ? "VALID" : "INVALID" );
    }
}

