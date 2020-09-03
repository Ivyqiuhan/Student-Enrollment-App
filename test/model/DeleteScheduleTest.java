package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import people.Student;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DeleteScheduleTest {
    private MakeChangesToSchedule testBookSchedule;
    public Student students;

    @BeforeEach
    public void setUp() {
        testBookSchedule = new DeleteSchedule();
        students = new Student("Amy");
    }

    @Test
    public void changeClasstime() {
        testBookSchedule.setClassTime(1);
        testBookSchedule.changeClasstime(1);
        assertEquals(0, testBookSchedule.getClassTime());
    }

    @Test
    public void changeStudent() {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Amy");
        assertFalse(students.contains(student1));
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.remove(student3);
        testBookSchedule.students.add(student1);
        testBookSchedule.students.add(student2);
        testBookSchedule.students.add(student3);
        testBookSchedule.changeStudent(student3);
        assertEquals(students,testBookSchedule.students);
    }

//    @Test
//    public void testClassTime() {
//        assertEquals(null, testStudent.classTime(0));
//    }
//
//    @Test
//    public void testClassDate() {
//        assertEquals(null, testStudent.classDate(0));
//    }
//
//    @Test
//    public void testStudentName() {
//        assertEquals(null, testStudent.studentName("name"));
//    }
//
//    @Test
//    public void testClassesType() {
//        assertEquals(null, testStudent.classesType("0"));
//    }


}