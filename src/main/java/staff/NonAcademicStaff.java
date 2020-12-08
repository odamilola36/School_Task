package staff;

import commons.Person;
import commons.Staff;

public class NonAcademicStaff implements Person, Staff {
    private String firstName;
    private String lastName;
    private String role;

    public NonAcademicStaff(String firstName, String lastName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getFullName() {
        return String.format("%s%8s", firstName, lastName.toUpperCase());
    }

    @Override
    public String getRole() {
        return role;
    }
}
