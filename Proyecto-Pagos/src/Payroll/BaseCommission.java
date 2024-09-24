package Payroll;


public class BaseCommission extends Employee {

    private int salary;
    private int commission;

    public BaseCommission(String name, String id, String department, String hireDate, int salary, int commission) {
        super(name, id, department, hireDate);
        this.salary = salary;
        this.commission = commission;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }
}
