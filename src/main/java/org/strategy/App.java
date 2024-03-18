package org.strategy;

public class App 
{
    public static void main( String[] args )
    {
        Parser parser = new Parser(new ParseOnlyLetters());
        parser.parsing();
    }
}
