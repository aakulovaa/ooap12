package org.strategy;

public class ParseOnlyNumbers implements Parse{
    @Override
    public void parse(String line){
        System.out.println(line);
    }
}
