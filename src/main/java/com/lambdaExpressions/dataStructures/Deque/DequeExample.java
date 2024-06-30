package com.lambdaExpressions.dataStructures.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

    public void run() {
        Deque<String> deque = new LinkedList<>();

        // Adiciona elementos à frente e à traseira
        deque.addFirst("First");
        deque.addLast("Last");

        // Acessa elementos da frente e da traseira
        System.out.println("Primeiro: " + deque.getFirst());
        System.out.println("Último: " + deque.getLast());

        // Remove elementos da frente e da traseira
        System.out.println("Removido da frente: " + deque.removeFirst());
        System.out.println("Removido da traseira: " + ((LinkedList<?>) deque).removeLast());
    }
}
