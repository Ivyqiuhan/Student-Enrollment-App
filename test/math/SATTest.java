package math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SATTest {
    public MathTopics sat;

    @Test
    public void testConstructor() {
        sat = new SAT("statistics");
        assertEquals("statistics", sat.topics);
    }
}