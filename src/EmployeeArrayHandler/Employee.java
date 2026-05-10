package EmployeeArrayHandler;

public class Employee {

    private String EmpName;
    private int Age;
    private int Salary;

    public Employee(String EmpName, int Age, int Salary) {
        this.EmpName = EmpName;
        this.Age = Age;
        this.Salary = Salary;
    }

    public String getEmpName() {
        return EmpName;
    }
    public int getAge() {
        return Age;
    }
    public int getSalary() {
        return Salary;
    }
}

