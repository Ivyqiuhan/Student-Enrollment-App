package people;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StudentTest {

    private Student testStudent;

    @BeforeEach
    public void setUp() {
        testStudent = new Student();
    }

    @Test
    public void testConstructor() {

        assertEquals("", testStudent.getBookNumber());
        assertEquals(0, testStudent.getAge());
        assertEquals("", testStudent.getName());
    }

    @Test
    public void TestNeedMoreBooks() {
        testStudent.setBookNumber("CA001");
        //assertFalse(testStudent.needMoreBooks());

    }

    @Test
    void setName() {
        testStudent.setName("Amy");
        assertEquals("Amy", testStudent.getName());
    }


    @Test
    void setBookNumber() {
        testStudent.setName("CA001");
        assertEquals("", testStudent.getBookNumber());
    }

    @Test
    void setAge() {
        testStudent.setAge("12");
        assertEquals("12", testStudent.getAge());
    }

    @Test
    void updateStudentClassLevel() {
        StudentClassLevel studentClass = new StudentClassLevel();
        testStudent.updateStudentClassLevel(2);

    }

//    @Test
//    void needMoreBooks() {
//        assertFalse(testStudent.needMoreBooks());
//    }
}


//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class StudentTest {
//
//    @Test
//    void updateStudentClassLevel() {
//    }
//
//    @BeforeEach
//    void setUp() {
//    }
//
//    @Test
//    void setName() {
//    }
//
//    @Test
//    void getName() {
//    }
//
//    @Test
//    void setBookNumber() {
//    }
//
//    @Test
//    void getBookNumber() {
//    }
//
//    @Test
//    void getAge() {
//    }
//
//    @Test
//    void setAge() {
//    }
//
//    @Test
//    void testUpdateStudentClassLevel() {
//    }


