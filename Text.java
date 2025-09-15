import java.util.Scanner;

class Student{
    String name;
    int id;
    double gpa;

    public Student(String name, int id, double gpa){
        
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    boolean isEqual(Student other){
        return this.name.equals(other.name) && this.id == other.id && this.gpa == other.gpa;
    }

    void display(){
        System.out.print("Name: " + this.name + ", ID: " + this.id + ", GPA: " + this.gpa);
    }
}


public class Text {
    public static void main(String[] arga){
       Student student1 = new Student("Alice", 101, 3.8);
       Student student2 = new Student("Alice", 101, 3.8);
       Student student3 = new Student("Bob", 102, 3.6);
       student1.display();
       student2.display();
       student3.display();
       System.out.println("Are student1 and student2 equal? " + student1.isEqual(student2)); 
       System.out.println("Are student1 and student3 equal? " + student1.isEqual(student3));

    }
}