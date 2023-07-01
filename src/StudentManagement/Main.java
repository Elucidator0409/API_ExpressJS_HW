package StudentManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter number of students need to enroll: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Enroll enroll = new Enroll();
        enroll.addCoursesList(3,"Cal1", "Cal2", "Cal3");

        Student[] students = new Student[n];



        for(int i = 0; i < n; i++){
            int count = i +1 ;
            System.out.println("\nStudent " + count);
            students[i] = new Student();
            students[i].enrollCourse(enroll);
            students[i].payTuition();
        }

        for(int i = 0; i < n; i++){
            int count = i +1 ;
            System.out.println("\nStudent " + count );

            System.out.println(students[i].toString());
        }



    }
}
