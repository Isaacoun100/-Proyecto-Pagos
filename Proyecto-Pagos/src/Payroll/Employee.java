package Payroll;

import java.time.LocalDate;

public class Employee {

    //Por cada empleado se maneja su nombre, identificación, departamento donde
    //labora, fecha de ingreso a la fábrica.

    private String name;
    private int id;
    private String department;
    private LocalDate hireDate;

    public Employee(LocalDate hireDate, String department, int id, String name) {
        this.hireDate = hireDate;
        this.department = department;
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
