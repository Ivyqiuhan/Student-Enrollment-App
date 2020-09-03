package math;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PreCalculusTest {
    public MathTopics mathTopics3;
    public PreCalculus mathTopics;
    public PreCalculus mathTopics2;
    private PreCalculus mathTopicsArrayList;

    @Test
    public void testConstructor() {
        mathTopics3 = new PreCalculus("math");
        assertEquals("math", mathTopics3.topics);
        assertEquals(0,mathTopics3.counter);
        mathTopics3.topicCounter("math");
        assertEquals(1,mathTopics3.counter);
    }


    @Test
    public void counter() {
        mathTopics = new PreCalculus("trigonometry");
        mathTopics.topicCounter("trigonometry");
        assertEquals(1, mathTopics.counter);
    }

    @Test
    public void add() {
        mathTopics = new PreCalculus("trigonometry");
        mathTopics2 = new PreCalculus("exponents");
        mathTopicsArrayList = new PreCalculus("");
        ArrayList<String> testArray = new  ArrayList<>();
        testArray.add("trigonometry");
        testArray.add("exponents");
        mathTopicsArrayList.add(mathTopics);
        mathTopicsArrayList.add(mathTopics2);
        //assertEquals(testArray,mathTopicsArrayList);


    }
}