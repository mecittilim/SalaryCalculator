
import java.util.List;

public class Employee {


    private String name;
    private double salary;
    private int weeklyWorkHours;
    private int hireYear;


    public Employee(String name, double salary, int weeklyWorkHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.weeklyWorkHours = weeklyWorkHours;
        this.hireYear = hireYear;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return weeklyWorkHours;
    }

    public void setWorkHours(int weeklyWorkHours) {
        this.weeklyWorkHours = weeklyWorkHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }



    public double tax() {
        double tax;
        if (salary < 1000) {
            tax = salary * 0;
        } else {
            tax = -salary * 0.03;
        }
        return tax;
    }



    public double bonus() {
        double bonus = 0;

        if (weeklyWorkHours > 40) {
            int extraWorkHours;
            extraWorkHours = weeklyWorkHours - 40;
            bonus = extraWorkHours * 30;
        } else {
            return 0;
        }
        return bonus;
    }

    public double raiseSalary() {
        double raiseSalary = 0;
        int workYear = 2021 - hireYear;
        if (workYear < 10) {
            raiseSalary = (salary + bonus() + tax()) * 0.05;
        } else if (workYear > 9 && workYear < 20) {
            raiseSalary = (salary + bonus() + tax()) * 0.1;
        } else if (workYear > 19) {
            raiseSalary = (salary + bonus() + tax()) * 0.15;
        }
        return raiseSalary;
    }


    public double totalSalary() {
        double total = salary + raiseSalary() + bonus();
        return total;
    }


    public double netSalary() {
        double total = tax() + bonus() + salary;
        return total;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + weeklyWorkHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
