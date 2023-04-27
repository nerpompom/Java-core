package com.homeproject.hw_lesson_3;


public class Box <T extends Fruit> {
    private T fruitArray;

    public Box(T fruitInTheBox) {
        this.fruitArray = fruitInTheBox;
    }

    public T getFruitInTheBox() {
        return fruitArray;
    }

    public void setFruitInTheBox(T fruitInTheBox) {
        this.fruitArray = fruitInTheBox;
    }

    public double getWeight(T box) {
        return getFruitInTheBox().getWeight();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitInTheBox=" + fruitArray +
                '}';
    }

    public boolean compareTo(T o) {
        if (this.getWeight() - ((T) o).getWeight() == 0) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>(new Apple(1.0));
        System.out.println(appleBox1);


        Box<Orange> orangeBox1 = new Box<>(new Orange(1.5));
        System.out.println(orangeBox1);

    }

}
