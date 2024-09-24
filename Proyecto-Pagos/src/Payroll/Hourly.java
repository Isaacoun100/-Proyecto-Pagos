package Payroll;

public class Hourly extends Employee {

    private int hourlyRate;
    private int hoursWorked;

    public Hourly(String name, String id, String department, String hireDate, int hourlyRate, int hoursWorked) {
        super(name, id, department, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

}
