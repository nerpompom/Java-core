package com.homeproject.hw_lesson_3;

public class Orange extends Fruit{

    public Orange(double fruitWeight) {
        super(fruitWeight);
    }

    public String toString() {
        return "Вес апельсинов в коробке " + getWeight();
    }

}
