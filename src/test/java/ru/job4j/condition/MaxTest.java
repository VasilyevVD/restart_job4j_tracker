package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void max() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    void testMax() {
        int first = 3;
        int left = 4;
        int right = 5;
        int result = Max.max(first, left, right);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    void testMax1() {
        int first = 6;
        int second = 7;
        int left = 8;
        int right = 9;
        int result = Max.max(first, second, left, right);
        int expected = 9;
        assertEquals(expected, result);
    }
}