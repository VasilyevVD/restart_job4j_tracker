package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DeQueMain {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("second");
        deque.addFirst("first");
        deque.addLast("third");
        for (String string : deque) {
            System.out.println(string);
        }
        System.out.println();
        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println();

        Deque<String> deque1 = new LinkedList<>();
        deque1.add("second");
        deque1.addFirst("first");
        deque1.addLast("third");

        Iterator<String> iterator = deque1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        Iterator<String> iterator1 = deque1.descendingIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
