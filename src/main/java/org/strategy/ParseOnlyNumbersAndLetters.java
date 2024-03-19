package org.strategy;

import java.util.Arrays;

public class ParseOnlyNumbersAndLetters implements Parse{
    @Override
    public void parse(String line){
        Character[] numberLettersString = new Character[line.length()];
        int count = 0;
        for (int symbol=0;symbol<line.length();symbol++){
            if(Character.isLetter(line.charAt(symbol)) || Character.isDigit(line.charAt(symbol))){
                numberLettersString[count] = line.charAt(symbol);
                count++;
            }
        }
        char[] numberLetters = new char[count];
        for (int numberLetter=0;numberLetter<count;numberLetter++)
        {
            numberLetters[numberLetter] = numberLettersString[numberLetter];
        }
        System.out.println(Arrays.toString(numberLetters));
    }
}
