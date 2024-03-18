package org.strategy;

public class Parser {
    private Parse parse;

    public Parser(Parse parse) {
        this.parse = parse;
    }

    public void parsing(){
        parse.parse();
    }
}
