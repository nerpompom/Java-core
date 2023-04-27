package com.homeproject.hw_lesson_3;

public class Apple extends Fruit{

   public Apple(double fruitWeight) {
        super(fruitWeight);
    }

    @Override
    public String toString() {
        return "Вес яблок в коробке " + getWeight();
    }

}
