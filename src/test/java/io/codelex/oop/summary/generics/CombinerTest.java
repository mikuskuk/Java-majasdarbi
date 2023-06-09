package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinerTest {

    @Test
    public void testIntegerBigDecimal() {

        Integer integer = 5;
        BigDecimal decimal = new BigDecimal("13.3");
        String combined = Combiner.combineTwoItems(integer, decimal);
        String result = "First item: 5; Second item: 13.3";
        assertEquals(result, combined);

    }

    @Test
    public void testStringDouble() {

        String string = "This is a test";
        Double doubleItem = 1.25;
        String combined = Combiner.combineTwoItems(string, doubleItem);
        String result = "First item: This is a test; Second item: 1.25";
        assertEquals(result, combined);

    }

    @Test
    public void testCharBoolean() {

        Character charItem = 'M';
        Boolean bool = true;
        String combined = Combiner.combineTwoItems(charItem, bool);
        String result = "First item: M; Second item: true";
        assertEquals(result, combined);
        
    }

}
