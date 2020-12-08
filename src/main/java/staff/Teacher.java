package staff;

import commons.Course;
import commons.Person;
import commons.Staff;
import students.Student;

public class Teacher implements Person, Staff {
    private String firstName;
    private String lastName;
    private final String role;
//    private SchoolClass assignedClass;
    private Course course;

    public Teacher(String firstName, String lastName, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
//        this.assignedClass = assignedClass;
        this.course = course;
        this.role = "Teacher";
    }


    @Override
    public String getFullName() {
        return String.format("%s%8s", firstName, lastName.toUpperCase());
    }

    @Override
    public String getRole() {
        return role;
    }
    public void promoteStudent(Student student){
        //A teacher can promote a student by setting new class for the student
//        student.setaClass(new SchoolClass(newClassName));
    }
}
