package applicant;

import commons.Person;
import commons.SchoolClass;

public class Applicant implements Person {

    private SchoolClass classApplyingTo;
    private String firstName;
    private String lastName;
    private int age;

    public Applicant(SchoolClass classApplyingTo, String firstName, String lastName, int age) {
        if ((classApplyingTo != null) && (firstName != null && lastName != null) && age > 0){
            this.classApplyingTo = classApplyingTo;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }else{
            System.out.println("Kindly enter valid value for the corresponding fields");
        }
    }
    public SchoolClass getClassApplyingTo() {
        return classApplyingTo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        if( age >= 0){
            return age;
        }
        else {
            System.out.println("age must be greater than zero");
            return 0;
        }
    }

    @Override
    public String getFullName() {
        return String.format("%s%20s%s", firstName, lastName.toUpperCase());
    }
}

//move the validation to a higher abstraction where these methods are called or objects created
