package ru.geekbrains.lesson1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private List<T> fruitList;

    private double totalWeight;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);

        totalWeight = totalWeight + fruit.getWeight();
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
