import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Mecit Tilim", 2000, 45, 1985);


        System.out.println("name: " + employee1.getName());
        System.out.println("salary: " + employee1.getSalary() + " TL");
        System.out.println("working hours of this week: " + employee1.getWorkHours());
        System.out.println("hire year: " + employee1.getHireYear());
        System.out.println("tax: " + employee1.tax() + " TL");
        System.out.println("bonus of this week: " + employee1.bonus() + " TL");

        System.out.println("salary increase: " + employee1.raiseSalary() + " TL");

        System.out.println("total salary: " + employee1.totalSalary() + " TL");
        System.out.println("net salary : " + employee1.netSalary() + " TL");


        System.out.println(employee1.toString());
    }

}
