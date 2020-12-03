package staff;

import commons.Person;
import commons.SchoolClass;
import commons.Staff;
import students.Student;

public class Principal implements Person, Staff {
    private String firstName;
    private String lastName;
    private final String role;

    public Principal(String firstName, String lastName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    @Override
    public String getFullName() {
        return String.format("%s\t%s", firstName, lastName.toUpperCase());
    }

    @Override
    public String getRole() {
        return role;
    }

    public void assignTeacherToClass(SchoolClass schoolClass, Teacher teacher){
        //the teacher needs to know which class he/she has been assigned to
        //the students need to also know their class teacher

    }
    public boolean removeStudent(Student student){
        return false;
    }

    public boolean addApplicant(Student student){
        return false;
    }
}
