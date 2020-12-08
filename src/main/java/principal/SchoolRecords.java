package principal;

import commons.SchoolClass;
import students.Student;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolRecords{
    private final Map<SchoolClass, List<Student>> schoolRecord;
//    List<Student> students;

    SchoolRecords() {
        schoolRecord = new HashMap<>();
    }
    public List<Student> getStudentsList(SchoolClass schoolClass){
        return schoolRecord.get(schoolClass);
    }
    public boolean hasStudent(Student student){
        if (schoolRecord.get(student.getAClass()).contains(student)){
            return true;
        }
        return false;
    }
    public boolean removeStudent(Student student){
        if (schoolRecord.get(student.getAClass()).contains(student)){
            return true;
        }
        return false;
    }
    public void addStudent(SchoolClass schoolClass, Student student){
        schoolRecord.get(schoolClass).add(student);
    }
    public void printStudents(SchoolClass schoolClass){
        System.out.println("Printing the list of students in: " +schoolClass.getClassName());
        int count = 1;
        for(Student student : schoolRecord.get(schoolClass)){
            System.out.println(String.format("%d.%8s", count, student.getFullName()));
        }
    }

}
