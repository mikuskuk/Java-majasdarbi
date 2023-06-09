package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest {

    @Test
    public void testPrint() {
        String text = "This is a test!";
        Printer<String> printer = new Printer<>(text);
        printer.print();
        assertEquals(text, printer.getThingToPrint());
    }

    @Test
    public void testPrintWithInteger() {
        Integer number = 13;
        Printer<Integer> printer = new Printer<>(number);
        printer.print();
        assertEquals(number, printer.getThingToPrint());
    }

    @Test
    public void testPrintWithDecimal() {
        Double decimal = 13.333;
        Printer<Double> printer = new Printer<>(decimal);
        printer.print();
        assertEquals(decimal, printer.getThingToPrint());
    }
}
