package org.strategy;

import java.util.Arrays;

public class ParseOnlyLetters extends ShowStrategy implements Parse {

    /**
     * Метод выведения в консоль названия алгоритма
     */
    @Override
    public void showName(){
        System.out.println("Алгоритм считывания из файла только букв.");
    }

    /**
     * Метод выведения в консоль описания алгоритма
     */
    @Override
    public void showDescription(){
        System.out.println("В методе просматриваются элементы поданной строки, если символ" +
                " является буквой - добавляет в массив, иначе - переход к следующему");
    }

    long startTime = System.nanoTime();

    /**
     * Метод для считывания из файла только букв.
     *
     * @param line - строка файла, передаваемая для вычленения из нее букв
     * @return
     */
    @Override
    public String parse(String line){
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
        return Arrays.toString(letters);
    }

    long endTime = System.nanoTime();

    /**
     * Метод выведения в консоль времени выполнения алгоритма
     */
    @Override
    public void showWorkTime()
    {
        long timeElapsed = endTime - startTime;
        System.out.println("Время выполнения:" + timeElapsed + " нс");
    }
}
