package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MakeChangesToScheduleTest {
    public  MakeChangesToSchedule changesInSchedule;

    @BeforeEach
    public void setUp() {
        changesInSchedule = new BookNewSchedule();
    }


    @Test
    public void setClassTime() {
        changesInSchedule.setClassTime(10);
        assertEquals(10,changesInSchedule.getClassTime());
    }

    @Test
    public void setClassDate() {
        changesInSchedule.setClassDate(10);
        assertEquals(10,changesInSchedule.getClassDate());
    }

    @Test
    public void setStudentName() {
        changesInSchedule.setStudentName("Amy");
        assertEquals("Amy",changesInSchedule.getStudentName());
    }

    @Test
    public void setClassType() {
        changesInSchedule.setClassType("English");
        assertEquals("",changesInSchedule.getClassType());
    }

    @Test
    public void getClassTime() {
        changesInSchedule.setClassTime(10);
        assertEquals(10,changesInSchedule.getClassTime());
    }

    @Test
    public void getClassDate() {
        changesInSchedule.setClassDate(10);
        assertEquals(10,changesInSchedule.getClassDate());
    }

    @Test
    public void getStudentName() {
        changesInSchedule.setStudentName("Amy");
        assertEquals("Amy",changesInSchedule.getStudentName());
    }

    @Test
    public void getClassType() {
        changesInSchedule.setClassType("English");
        assertEquals("",changesInSchedule.getClassType());
    }
}