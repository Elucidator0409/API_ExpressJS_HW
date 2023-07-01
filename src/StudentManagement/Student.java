package StudentManagement;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String[] coursesEnroll;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;
    public Student() {
        Scanner  in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("\n1 - Freshmen\n2 - Senior\nEnter your grade year level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " - " + " Year: "+ gradeYear + " - ID: "+studentID);


    }

    private void setStudentID(){
        this.studentID = gradeYear+ " " + id;
        ++id;
    }

    public void enrollCourse(Enroll enroll) {
        coursesEnroll = enroll.enrollActivity();
        for(int i = 0; i < coursesEnroll.length; i++){
            tuitionBalance += costOfCourse;
        }
    }

    public void viewBalance() {
        System.out.println("Your balance: $"+ tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter payment amount: ");
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Your payment: " + payment);
        System.out.println("Your balance: $"+ tuitionBalance);

    }

    public String toString() {
        return firstName + " " + lastName +
                "\nCourses enrolled: " + coursesEnroll +
                "\n Tuition Balance: $" + tuitionBalance;
    }




}
