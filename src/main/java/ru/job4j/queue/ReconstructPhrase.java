package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;
    private final Deque<Character> evenElement;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElement) {
        this.descendingElements = descendingElements;
        this.evenElement = evenElement;
    }

    private String getEvenElements() {
        StringBuilder result = new StringBuilder();
        int size = evenElement.size();
        for (int i = 0; i < size; i++) {
            char string = evenElement.poll();
            if (i % 2 == 0) {
                result.append(string);
            }
            evenElement.add(string);
        }
        return result.toString();
    }

    private String getDescendingElements() {
        StringBuilder result = new StringBuilder();
        int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            char string = descendingElements.pollLast();
            result.append(string);
        }
        return result.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
