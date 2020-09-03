//package peopleTest;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import people.Student;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class StudentTest {
//
//    private Student testStudent;
//
//    @BeforeEach
//    public void setUp() {
//        testStudent = new Student();
//    }
//
//    @Test
//    public void testConstructor() {
//
//        assertEquals("", testStudent.getBookNumber());
//        assertEquals(0, testStudent.getAge());
//        assertEquals("", testStudent.getName());
//    }
//
//    @Test
//    public void TestNeedMoreBooks() {
//        testStudent.setBookNumber("CA001");
//        assertFalse(testStudent.needMoreBooks());
//
//    }
//
//    @Test
//    public void testOverrideEquale() {
//        testStudent.setName("Amy");
//        Student temoStu = new Student("Amy");
//
//        assertTrue(testStudent.equals(temoStu));
//        assertTrue (testStudent.equals(testStudent));
//        assertFalse(testStudent.equals(null));
//    }
//
//    @Test
//    public void testHashCode() {
//        Map<Student, Integer> studentsNameList = new HashMap<>();
//        Student temoStu = new Student("Amy");
//        studentsNameList.put(temoStu, 1);
//        //assertEquals(212921633,studentsNameList.hashCode());
//    }
//
//
//
//}
