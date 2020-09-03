package model;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import people.Student;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookNewScheduleTest {

    private MakeChangesToSchedule testBookSchedule;
    public Student students;

    @BeforeEach
    public void setUp() {
        testBookSchedule = new BookNewSchedule();
        students = new Student("Amy");
    }

    @Test
    public void changeClasstime() {
        testBookSchedule.setClassTime(1);
        testBookSchedule.changeClasstime(2);
        assertEquals(2, testBookSchedule.getClassTime());
    }

    @Test
    public void changeStudent() {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Amy");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        testBookSchedule.changeStudent(student1);
        testBookSchedule.changeStudent(student2);
        testBookSchedule.changeStudent(student3);
        assertEquals(students,testBookSchedule.students);

    }

//    @Test
//    public void testClassTime() {
//        assertEquals(null,testStudent.classTime(0));
//    }
//
//    @Test
//    public void testClassDate() {
//        assertEquals(null,testStudent.classDate(0));
//    }
//
//    @Test
//    public void testStudentName() {
//        assertEquals(null,testStudent.studentName("name"));
//    }
//
//    @Test
//    public void testClassesType() {
//        assertEquals(null,testStudent.classesType("0"));
//    }

}