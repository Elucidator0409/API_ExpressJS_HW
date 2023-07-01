package EmployeeSystem;

class Employee {
    private String name;
    public Employee(String name){
        this.name = name;
    }

    public void work() {
        System.out.println("Employee working");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + "]";
    }
    
}