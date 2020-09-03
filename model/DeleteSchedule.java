package model;

import people.Student;

import java.util.ArrayList;

public class DeleteSchedule extends MakeChangesToSchedule {

    public DeleteSchedule() {
        super();
    }

    @Override
    // MODIFIES: this
    // EFFECTS:  delete the class time
    public void changeClasstime(Integer classTime) {
        this.setClassTime(0);
    }

    @Override
    // MODIFIES: this
    // EFFECTS:  remove the student to the Arraylist
    public ArrayList<Student> changeStudent(Student student) {
        if (this.students.contains(student)) {
            students.remove(student);
        }
        return students;
    }

}


//    @Override
//    public ArrayList<Integer> classTime(Integer time) {
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
//}
