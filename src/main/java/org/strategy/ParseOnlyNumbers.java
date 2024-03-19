package org.strategy;

import java.util.Arrays;

public class ParseOnlyNumbers extends ShowStrategy implements Parse{

    /**
     * Метод выведения в консоль названия алгоритма
     */
    @Override
    public void showName(){
        System.out.println("Алгоритм считывания из файла только цифр.");
    }

    /**
     * Метод выведения в консоль описания алгоритма
     */
    @Override
    public void showDescription(){
        System.out.println("В методе просматриваются элементы поданной строки, если символ" +
                " является цифрой - добавляет в массив, иначе - переход к следующему");
    }

    long startTime = System.nanoTime();

    /**
     * Метод для считывания из файла только цифр.
     * @param line - строка файла, передаваемая для вычленения из нее цифр
     */
    @Override
    public void parse(String line){
        String[] numbersString = new String[line.length()];
        int countNumber = 0;
        for (int symbol=0;symbol<line.length();symbol++){
            if(Character.isDigit(line.charAt(symbol))){
                numbersString[countNumber] = String.valueOf(line.charAt(symbol));
                countNumber++;
            }
        }
        Integer[] numbers = new Integer[countNumber];
        for (int number=0;number<countNumber;number++)
        {
            numbers[number] = Integer.parseInt(numbersString[number]);
        }
        System.out.println(Arrays.toString(numbers));

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
