package Lab9a;

public class Employee {
    private double wage;
    private String name;

    public Employee() {
    }

    public void setName(String employeeName) {
        name = employeeName;
    }

    public String getName() {
        return name;
    }

    public double weeklyPay(int hoursWorked) {
        return wage * hoursWorked;
    }
}
