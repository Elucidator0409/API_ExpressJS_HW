package StudentManagement;

public class Course {
    private final String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }




    @Override
    public String toString() {
        return name ;
    }
}
