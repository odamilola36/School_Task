import commons.Course;
import commons.SchoolClass;
import staff.Teacher;
import students.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Damilola", "Omowumi",
                new SchoolClass("JSS1"), 15, new Teacher("Alao", "Sunday",
                new Course("Mathematics", "MTH101")));

        System.out.println(student.getaClass().getClassName());
    }
}
