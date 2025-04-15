//6. Write a Java program where:
//
//A class Student has attributes name (String) and rollNumber (int).
//
//A constructor initializes these attributes.
//
//In the main method, create three student objects and print their details.

class Student{
    String name;
    int rollNumber;

    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void displayStudentDetails(){
        System.out.println(name);

        System.out.println(rollNumber);
        System.out.println("\n");
    }
}

public class _15_assignmentStudent {
    public static void main(String[] args) {


        Student hari = new Student("Hari Shrestha", 12);
        Student anamika = new Student("Anamika Thapa",1);

        hari.displayStudentDetails();
        anamika.displayStudentDetails();
    }

}
