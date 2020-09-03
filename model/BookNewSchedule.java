package model;

import people.Student;

import java.util.ArrayList;

public class BookNewSchedule extends MakeChangesToSchedule {

    public BookNewSchedule() {
        super();
    }

    @Override
    // MODIFIES: this
    // EFFECTS:  add the class time
    public void changeClasstime(Integer classTime) {
        this.setClassTime(classTime);
    }

    @Override
    // MODIFIES: this
    // EFFECTS:  add the student to the Arraylist
    public ArrayList<Student> changeStudent(Student student) {
        students.add(student);
        return students;
    }

//    @Override
//    public ArrayList<Integer> classTime(Integer time) {
//
//        return null;
//    }
//
//    @Override
//    public ArrayList<Integer> classDate(Integer date) {
//        return null;
//    }
//
//    @Override
//    public ArrayList<String> studentName(String name) {
//        return null;
//    }
//
//    @Override
//    public String classesType(String type) {
//        return null;
//    }
}
