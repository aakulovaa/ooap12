package org.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParseOnlyNumbersAndLettersTest {

    @Test
    void parse() {
        String line = "12 4&&& 54!6 fe% 3";
        ParseOnlyNumbersAndLetters parseOnlyNumbersAndLetters = new ParseOnlyNumbersAndLetters();
        String result = parseOnlyNumbersAndLetters.parse(line);
        String expected = "[1, 2, 4, 5, 4, 6, f, e, 3]";
        assertEquals(expected,result);
    }
}