package org.strategy;

/**
 * Абстрактный класс, содержащий методы для стратегий
 */
public abstract class ShowStrategy {
    public void show(){
        showName();
        showDescription();
        showWorkTime();
    }

    /**
     * Метод выведения в консоль названия алгоритма
     */
    public abstract void showName();
    /**
     * Метод выведения в консоль описания алгоритма
     */
    public abstract void showDescription();
    /**
     * Метод выведения в консоль времени выполнения алгоритма
     */
    public abstract void showWorkTime();
}
