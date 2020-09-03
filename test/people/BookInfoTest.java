package people;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookInfoTest {
    private BookInfo testStudent;

    @BeforeEach
    public void setup() {
        testStudent = new BookInfo();
    }

        @Test
    public void testConstructor() {
        assertEquals("", testStudent.getBookNumber());
        //assertEquals(0, testStudent.getAge());
        //assertEquals("", testStudent.getName());
    }


    @Test
    void setBookNumber() {
        testStudent.setBookNumber("CA000");
        assertEquals("CA000", testStudent.getBookNumber());
    }

    @Test
    void needMoreBooks() {
        assertFalse(testStudent.needMoreBooks());
    }
}