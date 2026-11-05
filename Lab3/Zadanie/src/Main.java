class Employee {
    String fullname;
    double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-15s %10s\n", "ФИО", "Зарплата");

        for (Employee e : employees) {
            System.out.printf("%-15s %10.2f\n", e.fullname, e.salary);
        }
    }
}

public class Main {
    public static void main() {
        Employee[] employees = new Employee[]{
                new Employee("Адинец", 2250.50),
                new Employee("Альшанец", 2090.00),
                new Employee("Студент", 900.755)
        };

        Report.generateReport(employees);
    }
}