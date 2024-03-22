package org.strategy;

public interface Parse {
    /**
     * Метод вычленения из строки нужных значений
     *
     * @param line - строка, передаваемая для обработки
     * @return
     */
    String parse(String line);
}
