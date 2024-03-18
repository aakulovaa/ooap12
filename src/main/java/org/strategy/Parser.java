package org.strategy;

/**
 * Класс Парсер для синтаксического анализа данных из файла
 * со свойством <b>parse</b>
 */
public class Parser {
    private Parse parse;

    /**
     * Конструктор для установки значения parse
     * @param parse - элемент одного из классов, реализующих интерфейс
     */
    public Parser(Parse parse) {
        this.parse = parse;
    }

    /**
     * Метод считывания из файла по определенному условию
     */
    public void parsing(){
        parse.parse();
    }
}
