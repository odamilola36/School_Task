package commons;

import staff.Teacher;

public class SchoolClass {
    private String className;
    private int numOfStudents;
//    private Teacher assignedTeacher;

    public SchoolClass(String className) {
//        this.assignedTeacher = assignedTeacher;
        this.className = className;
        this.numOfStudents =  numOfStudents;
    }

    public String getClassName() {
        return className;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

//    public Teacher getAssignedTeacher() {
//        return assignedTeacher;
//    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

//    public void setAssignedTeacher(Teacher assignedTeacher) {
//        this.assignedTeacher = assignedTeacher;
//    }

    public void addStudent(){
        numOfStudents++;
    }
}
