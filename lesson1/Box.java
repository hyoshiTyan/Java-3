package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.size() > 0) {
            return fruits.size() * fruits.get(0).getWeight();
        }
        return 0;
    }

    public boolean compare(Box<?> box){
        return this.getWeight() == box.getWeight();
    }

    public void emptyBox(Box<T> other){
        if (other == null || this == other || other.fruits.isEmpty()){
            return;
        }
        other.fruits.addAll(fruits);
        fruits.clear();
    }

}