package com.ssnit.session18;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("abc");
        queue.add("xyz");
        System.out.println(queue.peek());
    }
}
