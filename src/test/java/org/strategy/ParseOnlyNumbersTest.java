package org.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParseOnlyNumbersTest {

    @Test
    void testParse() {
        String line = "12 4 546 fe 3";
        ParseOnlyNumbers parseOnlyNumbers = new ParseOnlyNumbers();
        String result = parseOnlyNumbers.parse(line);
        String expected = "[1, 2, 4, 5, 4, 6, 3]";
        assertEquals(expected,result);
    }
}