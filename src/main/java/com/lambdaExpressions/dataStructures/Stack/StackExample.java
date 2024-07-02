package com.lambdaExpressions.dataStructures.Stack;

import java.util.Stack;

public class StackExample {

    public void run() {

        Stack<Integer> stack = new Stack<>();

        // Adicionando elementos à Stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Exibindo o conteúdo da Stack
        System.out.println("Stack: " + stack);

        // Removendo elementos da Stack
        int removedElement = stack.pop();
        System.out.println("Elemento removido: " + removedElement);
        System.out.println("Stack após remoção: " + stack);

        // Visualizando o elemento no topo da Stack
        int topElement = stack.peek();
        System.out.println("Elemento no topo: " + topElement);

        // Verificando se a Stack está vazia
        boolean isEmpty = stack.isEmpty();
        System.out.println("A Stack está vazia? " + isEmpty);
    }
}
