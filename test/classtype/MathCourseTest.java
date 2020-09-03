package classtype;

import math.MathCourse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathCourseTest {

    private MathCourse testStudent;
   // FrontDesk frontDesk;

    @BeforeEach
    public void setUp() {
        System.out.println("hi");
        testStudent = new MathCourse();
       // frontDesk = new FrontDesk();
    }

    @Test
    public void testConstructor() {
        assertEquals(0,testStudent.studentNumber);
        assertEquals(0, testStudent.textbookNumber);
        assertEquals(0, testStudent.tution);
    }

    @Test
    public void testSetTextbookNum()
    {
        testStudent.setTextbookNum(0);
        assertEquals(0,testStudent.textbookNumber);
    }

    @Test
    public void testSetStudentNumber() {
        testStudent.setStudentNumber(0);
        assertEquals(0,testStudent.studentNumber);
    }

    @Test
    public void testSetTuition() {
        testStudent.setTuition(0);
        assertEquals(0,testStudent.tution);
    }

    @Test
    public void testGetTuition() {
        testStudent.setTuition(100);
        assertEquals(100,testStudent.getTuition());
    }


    @Test
    public void testPaymentDue() {
        assertFalse(testStudent.paymentDue());
    }

   // @Test
//    public void stuIsInClassNoPayMent() {
//        try {
//            testStudent.paymentDue = false;
//            testStudent.isInEnglishClass = true;
//            testStudent.totalPaymentDue();
//        } catch (NotInEnglishClassException notInEnglishClass) {
//            fail("Not in the class when he should be in class");
//        } catch (NotInClassException notInClassException) {
//            fail("Not in the class when he should be in class");
//        }
//
//        assertEquals(1, testStudent.tution);
//    }

//    @Test
//    public void stuNotInClassNoPayMent() {
//        try {
//            testStudent.paymentDue = false;
//            testStudent.isInEnglishClass = false;
//            testStudent.totalPaymentDue();
//        } catch (NotInEnglishClassException notInEnglishClass) {
//            //do nothing
//        } catch (NotInClassException notInClassException) {
//            fail("Should catch in NotInEnglishClass, but it did not");
//        }
//
//        assertEquals(0, testStudent.tution);
//    }
//
//    @Test
//    public void stuNotInClassNoPayMentException() {
//        try {
//            testStudent.paymentDue = false;
//            frontDesk.printTuitionBill();
//
//        } catch (NoPaymentDueException np) {
//            //do nothing
//        }
//
//        assertEquals(0, testStudent.tution);
//    }
}
