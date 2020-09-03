package math;

import people.Student;

import java.util.ArrayList;

public class ChangeMathSchedule extends Subject {
    public ArrayList<Student> students;
    public MathTopics mathTopics;

    //Constructor
    public ChangeMathSchedule() {
        students = new ArrayList<>();
        mathTopics = new PreCalculus("Trig");
    }

    // MODIFIES: this
    // EFFECTS:  add student to students Arraylist
    public void addStudent(Student student) {
        students.add(student);
        addObserve(student);
        notifyObservers(mathTopics);
    }
}
