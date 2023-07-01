package EmployeeSystem;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("E1");
        System.out.println(e.toString());
        e.work();
        System.out.println();

        Manager m = new Manager("M1", 22);
        System.out.println(m.toString());
        e.work();
        System.out.println();

        Engineer engineer = new Engineer("enineer1", 1000);
        System.out.println(engineer.toString());
        engineer.work();
    }
}
