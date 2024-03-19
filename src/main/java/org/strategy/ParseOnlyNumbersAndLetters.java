package org.strategy;

import java.util.Arrays;

public class ParseOnlyNumbersAndLetters extends ShowStrategy implements Parse{

    /**
     * Метод выведения в консоль названия алгоритма
     */
    @Override
    public void showName(){
        System.out.println("Алгоритм считывания из файла только цифр и букв.");
    }

    /**
     * Метод выведения в консоль описания алгоритма
     */
    @Override
    public void showDescription(){
        System.out.println("В методе просматриваются элементы поданной строки, если символ" +
                " является цифрой или буквой - добавляет в массив, иначе - переход к следующему");
    }

    long startTime = System.nanoTime();

    /**
     * Метод для считывания из файла только цифр или букв.
     * @param line - строка, передаваемая для обработки
     */
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
