package principal;

import applicant.Applicant;
import commons.Person;
import commons.Staff;
import staff.Teacher;
import students.Student;

public class Principal implements Person, Staff {
    private String firstName;
    private String lastName;
    private final String role;

    //create constants
    //create a new studentList on entry of the program
    private final SchoolRecords studentsList = new SchoolRecords();
    private final int admissionAgeBenchmark = 14;

    public Principal(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = "Principal";
    }

    @Override
    public String getFullName() {
        return String.format("%s%8s", firstName, lastName.toUpperCase());
    }

    @Override
    public String getRole() {
        return role;
    }

    public boolean removeStudent(Student student){
        if (studentsList.hasStudent(student)){
            studentsList.removeStudent(student);
            System.out.println(student.getFullName() + "has been removed successfully");
            return true;
        } else {
            System.out.println("We have no record of " +student.getFullName());
            return false;
        }
    }

    //the teacher property of this method might need attention;
    public boolean addApplicant(Applicant applicant, Teacher classTeacher){
        if (applicant.getAge() < admissionAgeBenchmark){
            System.out.println("Sorry, we don't admit students that are less than "
                    + admissionAgeBenchmark + "years old");
            return false;
        } else {
            Student newStudent = new Student(applicant.getFirstName(), applicant.getLastName(),
                    applicant.getClassApplyingTo(), applicant.getAge(), classTeacher);
            if (studentsList.hasStudent(newStudent)) {
                System.out.println(newStudent.getAge() + " is already registered");
                return false;
            } else {
                studentsList.addStudent(newStudent.getAClass(), newStudent);
                return true;
            }
        }
    }
}
