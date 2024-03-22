package org.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParseOnlyLettersTest {

    @Test
    void testParse() {
        String line = "12 4 546 fe 3";
        ParseOnlyLetters parseOnlyLetters = new ParseOnlyLetters();
        String result = parseOnlyLetters.parse(line);
        String expected = "[f, e]";
        assertEquals(expected,result);
    }
}