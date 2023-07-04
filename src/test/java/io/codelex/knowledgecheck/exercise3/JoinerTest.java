package io.codelex.knowledgecheck.exercise3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JoinerTest {

    @Test
    public void testJoinInteger() {
        Joiner<Integer> joiner = new Joiner<>("-");

        assertEquals("1-2-3-4", joiner.join(1, 2, 3, 4));
        assertEquals("10-20-30-40", joiner.join(10, 20, 30, 40));
    }

    @Test
    public void testJoinChar() {
        Joiner<Character> joiner = new Joiner<>("-");

        assertEquals("A-B-C-D", joiner.join('A', 'B', 'C', 'D'));
        assertEquals("Z-W-Y-V", joiner.join('Z', 'W', 'Y', 'V'));
    }

    @Test
    public void testJoinString() {
        Joiner<String> joiner = new Joiner<>(" ");

        assertEquals("Mikus Kukainis", joiner.join("Mikus", "Kukainis"));
        assertEquals("Java Test", joiner.join("Java", "Test"));
    }

    @Test
    public void testJoinDouble() {
        Joiner<Double> joiner = new Joiner<>("/");

        assertEquals("15.5/20.5", joiner.join(15.5, 20.5));
        assertEquals("105.9/220.1", joiner.join(105.9, 220.1));
    }
}
