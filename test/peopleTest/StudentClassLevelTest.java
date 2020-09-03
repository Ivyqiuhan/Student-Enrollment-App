//package peopleTest;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import people.StudentClassLevel;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//
//public class StudentClassLevelTest {
//    private StudentClassLevel testStudent;
//
//    @BeforeEach    public void setup() {
//        testStudent = new StudentClassLevel();
//    }
//
//    @Test
//    public void testConstructor() {
//        assertEquals(0, testStudent.getPeridNum());
//        assertEquals(0, testStudent.getStartBookNum());
//    }
//
//    @Test
//    public void testClassMatchGradeLevel() {
//
//        assertFalse(testStudent.classMatchGradeLevel());
//    }
//
//    @Test
//    public void  testNeedsJumpLevel() {
//        assertFalse(testStudent.needsJumpLevel());
//    }
//
//    @Test
//    public void testUpdatePeriodNum() {
//        testStudent.updatePeriodNum();
//        assertEquals(0,testStudent.getStudentGradeLevel());
//    }
//
//
//    @Test
//    public void testUpdateClassLevel() {
//        testStudent.updateClassLevel();
//        assertEquals(0,testStudent.getStudnetCurrentLevel());
//    }
//
//    @Test
//    public void testUpdateGradeLevel() {
//        testStudent.updateGradeLevel();
//        assertEquals(0,testStudent.getStudnetCurrentLevel());
//    }
//}
