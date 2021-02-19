package ru.geekbrains.lesson1;
import ru.geekbrains.lesson1.Apple;
import ru.geekbrains.lesson1.Orange;

import javax.swing.*;
import javax.swing.Box;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        String[] arr = {"One", "Two", "Free", "Four"};
        System.out.println("Задание 1:\n" + Arrays.toString(arr));
        swap(arr,1,2);
        System.out.println(Arrays.toString(arr));
        //Задание 2
        List<String> list = ToList(arr);
        System.out.println("Задание 2:\n" + list);

    }


    private static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }
    private static <E> List<E> ToList(E[]array){
        return Arrays.asList(array);
    }


}

