package Payroll;

public class Monthly extends Employee{

    private int salary;

    public Monthly(String name, String id, String department, String hireDate, int salary) {
        super(name, id, department, hireDate);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
