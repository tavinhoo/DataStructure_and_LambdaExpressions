package com.lambdaExpressions.dataStructures.Queue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    @Test
    public void run() {

        Queue<String> list = new LinkedList<>();

    // Adiciona elementos à fila
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

    // Acessa a cabeça da fila
        System.out.println("Cabeça da fila: " + list.peek());

    // Remove elementos da fila
        while (!list.isEmpty()) {
        System.out.println("Removido: " + list.poll());
    }
    }
}
