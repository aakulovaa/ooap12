package org.strategy;

public class ParseOnlyLetters implements Parse {
    @Override
    public void parse(String line){
        System.out.println(line);
    }
}
