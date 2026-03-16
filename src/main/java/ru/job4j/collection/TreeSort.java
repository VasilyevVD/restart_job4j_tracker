package ru.job4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> number = new TreeSet<>();
        number.add(5);
        number.add(1);
        number.add(3);
        System.out.println(number);
        System.out.println();
        Set<Integer> number1 = new TreeSet<>(Collections.reverseOrder());
        number1.add(5);
        number1.add(1);
        number1.add(3);
        System.out.println(number1);
    }
}
