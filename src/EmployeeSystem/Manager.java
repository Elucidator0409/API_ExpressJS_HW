package EmployeeSystem;

import java.util.jar.Attributes.Name;

import javax.print.attribute.standard.MediaSize.NA;

public class Manager extends Employee{
    private int age;
    public Manager(String name, int age){
        super(name);
        this.age = age;
    }

    public void work(){
        System.out.println("Manager working");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Manager [name="+ this.getName() +", age=" + age + "]";
    }
    
}
