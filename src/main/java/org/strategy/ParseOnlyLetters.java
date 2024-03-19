package org.strategy;

import java.util.Arrays;

public class ParseOnlyLetters implements Parse {
    /**
     * Метод для считывания из файла только букв.
     * @param line - строка файла, передаваемая для вычленения из нее букв
     */
    @Override
    public void parse(String line){
        Character[] lettersString = new Character[line.length()];
        int countLetter = 0;
        for (int symbol=0;symbol<line.length();symbol++){
            if(Character.isLetter(line.charAt(symbol))){
                lettersString[countLetter] = line.charAt(symbol);
                countLetter++;
            }
        }
        char[] letters = new char[countLetter];
        for (int letter=0;letter<countLetter;letter++)
        {
            letters[letter] = lettersString[letter];
        }
        System.out.println(Arrays.toString(letters));
    }
}
