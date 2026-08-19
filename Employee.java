class Employee {
    int empId;
    String name;
    double salary;

    void getEmployeeDetails(int id, String n, double s) {
        empId = id;
        name = n;
        salary = s;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : Rs." + salary);
    }
}

// Derived class
class Manager extends Employee {
    String department;

    void getManagerDetails(String dept) {
        department = dept;
    }

    void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Department    : " + department);
    }
}

public class Main {
    public static void main(String[] args) {

        Manager m = new Manager();

        m.getEmployeeDetails(101, "Nivetha", 50000);
        m.getManagerDetails("Computer Science");

        System.out.println("----- EMPLOYEE DETAILS -----");
        m.displayManagerDetails();
    }
}
