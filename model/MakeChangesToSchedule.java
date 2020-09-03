package model;

import people.Student;

import java.util.ArrayList;

public abstract class MakeChangesToSchedule {

    private Integer classTime;
    private Integer classDate;
    private String studentName;
    private String classType;
    public ArrayList<Student> students;

    public MakeChangesToSchedule() {
        classTime = 0;
        classDate = 0;
        studentName = "";
        classType = "";
        students = new ArrayList<>();
    }

    public void setClassTime(Integer classTime) {
        this.classTime = classTime;
    }

    public void setClassDate(Integer classDate) {
        this.classDate = classDate;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setClassType(String classType) {
        this.studentName = classType;
    }

    public Integer getClassTime() {
        return this.classTime;
    }

    public Integer getClassDate() {
        return this.classDate;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public String getClassType() {
        return this.classType;
    }



    // MODIFIES: this
    // EFFECTS:  change the student in the Arraylist
    public abstract ArrayList<Student> changeStudent(Student student);

    // MODIFIES: this
    // EFFECTS:  make change to the class time
    public abstract void changeClasstime(Integer classTime);


}
