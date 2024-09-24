package Payroll;


public class Employee {

    //Por cada empleado se maneja su nombre, identificación, departamento donde
    //labora, fecha de ingreso a la fábrica.

    private String name;
    private String id;
    private String department;
    private String hireDate;

    public Employee(String name, String id, String department, String hireDate) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
