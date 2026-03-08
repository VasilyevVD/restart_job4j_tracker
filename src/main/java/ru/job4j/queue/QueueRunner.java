package ru.job4j.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueRunner {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        System.out.println("State of Queue before remove: ");
        for (String string : queue) {
            System.out.println(string);
        }
        queue.remove();
        System.out.println();
        System.out.println("remove: ");
        System.out.println("State of Queue after remove: ");
        for (String string : queue) {
            System.out.println(string);
        }
        System.out.println();
        System.out.println("poll: ");
        Queue<String> queue1 = new LinkedList<>();
        String temp = queue1.poll();
        System.out.println(temp);

        System.out.println();
        System.out.println("offer: ");
        Queue<String> queue2 = new ArrayBlockingQueue<>(3);
        queue2.offer("first");
        queue2.offer("second");
        queue2.offer("third");
        queue2.offer("fourth");

        for (String string : queue2) {
            System.out.println(string);
        }

        System.out.println();
        System.out.println("peek: ");
        Queue<String> queue3 = new LinkedList<>();
        queue3.offer("first");
        queue3.offer("second");
        queue3.offer("third");
        System.out.println(queue3.peek());

    }
}
