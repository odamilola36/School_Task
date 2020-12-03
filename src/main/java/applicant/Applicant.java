package applicant;

import commons.Person;
import commons.SchoolClass;

public class Applicant implements Person {

    private SchoolClass classApplyingTo;//
    private String firstName;
    private String lastName;
    private int age;

    public Applicant(SchoolClass classApplyingTo, String firstName, String lastName, int age) {
        this.classApplyingTo = classApplyingTo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public SchoolClass getClassApplyingTo() {
        return classApplyingTo;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getFullName() {
        return String.format("%s\t%s", firstName, lastName.toUpperCase());
    }
}
