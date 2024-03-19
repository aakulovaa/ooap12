package org.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParseOnlyNumbers implements Parse{
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

}
