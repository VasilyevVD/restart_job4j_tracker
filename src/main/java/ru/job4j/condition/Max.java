package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int first, int left, int right) {
        return max(first, max(left, right));
    }

    public static int max(int first, int second, int left, int right) {
        return max(second, max(first, left, right));
    }
}
