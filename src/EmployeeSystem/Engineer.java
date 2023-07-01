package EmployeeSystem;

public class Engineer extends Employee{
    private int salary;

    public Engineer(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public void work() {
        System.out.println("Engineer working");
    }

    @Override
    public String toString() {
        return "Engineer [name="+ this.getName()+", salary=" + salary + "]";
    }
}
