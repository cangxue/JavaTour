import java.util.Date;

/**
 * Created by xiaoma on 2017/8/24.
 */
public class EmloyeeTest {
    public static  void  main(String[] args ) {

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl", 7500);
        staff[1] = new Employee("Harry", 400);
        staff[2] = new Employee("Tony", 300);
        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.print("name=" + e.getName() + ",salray = " + e.getSalary() + "\n");
        }
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent /100;
        salary += raise;
    }
}