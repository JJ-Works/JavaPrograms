//3. Define a class Employee with attributes empId (int) and salary (double). Include a constructor to initialize these attributes.

class Employee{
    int empId;
    double salary;

    Employee(){
        empId = 1919;
        salary = 35000;

    }

    void displayDetail(){

        System.out.println(empId + " is the employee Id.");
        System.out.println(empId +" gets " + salary + " per month.");
    }
}

public class _13_assignmentDisplayMethod {
    public static void main(String[] args) {
        Employee first = new Employee();

        first.displayDetail();
    }
}
