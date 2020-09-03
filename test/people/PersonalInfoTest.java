package people;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PersonalInfoTest {
    private PersonalInfo testStudent;

    @BeforeEach
    public void setup() {
        testStudent = new PersonalInfo();
    }

    @Test
    public void testConstructor() {

        //assertEquals("", testStudent.getBookNumber());
        assertEquals(0, testStudent.getAge());
        assertEquals("", testStudent.getName());
    }


    @Test
    void setName() {
        testStudent.setName("Amy");
        assertEquals("Amy", testStudent.getName());

    }

    @Test
    void getAge() {
        testStudent.setAge("12");
        assertEquals("12", testStudent.getAge());
    }


//    @Test
//    public void testOverrideEquale() {
//        testStudent.setName("Amy");
//        Student temoStu = new Student("Amy");
//        assertTrue (testStudent.equals(testStudent));
//        assertFalse(testStudent.equals(null));
//    }

    @Test
    public void HashCode() {
        Map<Student, Integer> studentsNameList = new HashMap<>();
        Student temoStu = new Student("Amy");
        studentsNameList.put(temoStu, 1);
        studentsNameList.hashCode();
        //assertEquals(2048425749,studentsNameList.hashCode());
    }

        @Test
    public void testOverrideEquale() {
        testStudent.setName("Amy");
        Student temoStu = new Student("Amy");

        assertFalse(testStudent.equals(temoStu));
        assertTrue (testStudent.equals(testStudent));
        assertFalse(testStudent.equals(null));
    }

    @Test
    public void testHashCode() {
        Map<Student, Integer> studentsNameList = new HashMap<>();
        Student temoStu = new Student("Amy");
        Student tempStu = new Student("Bob");
        studentsNameList.put(temoStu, 1);
        studentsNameList.put(tempStu, 1);
        int i = temoStu.hashCode();
        assertEquals(i, temoStu.hashCode());
    }



}