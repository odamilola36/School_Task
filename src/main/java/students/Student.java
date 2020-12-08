package students;

import commons.Course;
import commons.Person;
import commons.SchoolClass;
import staff.Teacher;
import java.util.ArrayList;

public class Student implements Person {
    private String firstName;
    private String lastName;
    private SchoolClass aClass;//rena
    private int age;
    private Teacher classTeacher;
    private ArrayList<Course> courses;

    public Student(String firstName, String lastName, SchoolClass aClass, int age, Teacher classTeacher) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.aClass = aClass;
        this.age = age;
        this.classTeacher = classTeacher;
        courses = new ArrayList<>();
    }

    public SchoolClass getAClass() {
        return aClass;
    }

    public int getAge() {
        return age;
    }

    public Teacher getClassTeacher() {
        return classTeacher;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setAClass(SchoolClass aClass) {
        this.aClass = aClass;

    }

    public void setClassTeacher(Teacher classTeacher) {
        this.classTeacher = classTeacher;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String getFullName() {
        return String.format("%s%8s", firstName, lastName.toUpperCase());
    }
}
