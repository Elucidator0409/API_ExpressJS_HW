package StudentManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Enroll {
    private  ArrayList<Course> courseList  = new ArrayList<>();
    private String[] courses ;

    public Enroll() {
        initializeCourseList();
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void initializeCourseList(){
        courseList.add(new Course("Java"));
        courseList.add(new Course("Python"));
        courseList.add(new Course("C++"));
        courseList.add(new Course("C#"));
        courseList.add(new Course("Ruby"));
        courseList.add(new Course("PHP"));
    }
    public void addCoursesList(int num, String ...courseName){
        for (int i = 0; i < num; i++) {
            courseList.add(new Course(courseName[i]));
        }
    }

    public String[] enrollActivity(){
        System.out.println("\nCourse enroll: ");
        System.out.println("List of courses: " + getCourseList());
        int count = 0;
        do {
            System.out.print("Enter course to enroll (STOP to quit/stop enroll): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("STOP")) {
                courses[count] =  course  ;
//                tuitionBalance += costOfCourse;
                count = count + 1;
            } else {
                break;
            }
        } while (1 != 0);
        System.out.println("\nEnrolled : "+ Arrays.toString(courses));

        return courses;
    }
}
