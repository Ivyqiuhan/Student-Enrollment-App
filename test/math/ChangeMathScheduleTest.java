package math;

import org.junit.jupiter.api.Test;
import people.Student;

import static org.junit.jupiter.api.Assertions.*;

public class ChangeMathScheduleTest {
    public ChangeMathSchedule changeMathSchedule;
    public Student student = new Student();

    @Test
    public void addStudent() {
        changeMathSchedule = new ChangeMathSchedule();
        changeMathSchedule.addStudent(student);
    }

    @Test
    public void testAddStudent() {
    }
}