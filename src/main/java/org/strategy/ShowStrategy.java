package org.strategy;

public abstract class ShowStrategy {
    public void show(){
        showName();
        showDescription();
        showWorkTime();
    }

    public abstract void showName();
    public abstract void showDescription();
    public abstract void showWorkTime();
}
