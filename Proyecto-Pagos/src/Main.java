import java.util.ArrayList;
import java.util.Scanner;
import Payroll.*;

public class Main {
    public static void main(String[] args) {

        // Lists for the available payrolls
        ArrayList<BaseCommission> commissionPayroll = new ArrayList<>();
        ArrayList<Monthly> monthlyPayroll = new ArrayList<>();
        ArrayList<Hourly> hourlyPayroll = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Welcome to the payroll manager \n" +
                    "Press 1 to Add an employee \n" +
                    "Press 2 to List all employees \n" +
                    "Press 3 to List monthly employees \n" +
                    "Press 4 to List hourly employees \n" +
                    "Press 5 to List commission employees");
            String menu = scanner.nextLine();

            switch (menu){
                case "1":

                    System.out.println("Employee name");
                    String employeeName = scanner.nextLine();

                    System.out.println("Employee id");
                    String employeeId = scanner.nextLine();

                    System.out.println("Employee department");
                    String employeeDepartment = scanner.nextLine();

                    System.out.println("When was the employee added to the company?");
                    String employeeAdd = scanner.nextLine();

                    System.out.println("What type of payroll is the employee in? \n" +
                            "Press 1 for Monthly salary \n" +
                            "Press 2 for Hourly salary \n" +
                            "Press 3 for Commission salary");
                    String payrollType = scanner.nextLine();

                    switch (payrollType){
                        case "1":
                            System.out.println("Please enter the salary");
                            int salary = scanner.nextInt();

                            Monthly newMonthlyEmployee = new Monthly(employeeName, employeeId, employeeDepartment, employeeAdd, salary);
                            monthlyPayroll.add(newMonthlyEmployee);
                            break;


                        case "2":
                            System.out.println("Please enter the hours the employee works");
                            int hours = scanner.nextInt();
                            System.out.println("Please enter the hourly rate");
                            int rate = scanner.nextInt();

                            Hourly newHourlyEmployee = new Hourly(employeeName, employeeId, employeeDepartment, employeeAdd, rate, hours);
                            hourlyPayroll.add(newHourlyEmployee);
                            break;

                        case "3":
                            System.out.println("Please enter the salary rate");
                            int  salaryCommission = scanner.nextInt();
                            System.out.println("Please enter the commission rate");
                            int commission = scanner.nextInt();

                            BaseCommission newBaseCommissionEmployee = new BaseCommission(employeeName, employeeId, employeeDepartment, employeeAdd, salaryCommission, commission);
                            commissionPayroll.add(newBaseCommissionEmployee);
                            break;

                        default:
                            System.out.println("Invalid payroll type");
                            break;
                    }
                    break;

                case "2":
                    printMonthly(monthlyPayroll);
                    printHourly(hourlyPayroll);
                    printCommission(commissionPayroll);
                    break;
                case "3":
                    printMonthly(monthlyPayroll);
                    break;
                case "4":
                    printHourly(hourlyPayroll);
                    break;
                case "5":
                    printCommission(commissionPayroll);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }


    }

    public static void printMonthly( ArrayList<Monthly> monthlyPayroll ){

        for (Monthly monthly : monthlyPayroll){
            System.out.println("Name : " + monthly.getName());
            System.out.println("Id : " + monthly.getId());
            System.out.println("Department : " + monthly.getDepartment());
            System.out.println("Hired on: " + monthly.getHireDate());
            System.out.println("Salary: " + monthly.getSalary() +"\n");
        }

    }

    public static void printHourly( ArrayList<Hourly> hourlyPayroll ){
        for (Hourly hourly : hourlyPayroll){
            System.out.println("Name : " + hourly.getName());
            System.out.println("Id : " + hourly.getId());
            System.out.println("Department : " + hourly.getDepartment());
            System.out.println("Hired on: " + hourly.getHireDate());
            System.out.println("Hourly rate: " + hourly.getHourlyRate());
            System.out.println("Hours worked: " + hourly.getHoursWorked() + "\n");
        }
    }

    public static void printCommission( ArrayList<BaseCommission> commissionPayroll ){
        for (BaseCommission commission : commissionPayroll){
            System.out.println("Name : " + commission.getName());
            System.out.println("Id : " + commission.getId());
            System.out.println("Department : " + commission.getDepartment());
            System.out.println("Hired on: " + commission.getHireDate());
            System.out.println("Salary: " + commission.getSalary());
            System.out.println("Commission: " + commission.getCommission() + "\n");

        }
    }

}