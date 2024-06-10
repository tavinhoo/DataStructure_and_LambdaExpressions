package com.lambdaExpressions.dataStructures.List;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class Lists {

    @Test
        public void run() {

            // ArrayList
            // ArrayList: O(1) para acessar qualquer elemento pelo índice.
            // Inserção e remoção de elementos no final são rápidas (O(1)),
            // mas no início ou no meio são lentas (O(n)), pois os elementos subsequentes precisam ser movidos.
            List<Integer> listOfIntegers = new ArrayList<>();

            listOfIntegers.add(100);
            listOfIntegers.add(200);
            listOfIntegers.add(300);
            listOfIntegers.add(400);
            listOfIntegers.add(500);
            listOfIntegers.add(600);

            // Tamanho
            listOfIntegers.size();

            // Pegando primeiro Item
            Integer firstInteger = listOfIntegers.getFirst();

            // Removendo item da posição 1
            listOfIntegers.remove(1);

            // Adicionando outro array em listOfInteger
            listOfIntegers.addAll(Arrays.asList(90, 80, 21, 312, 432));

            // adicionando em index: 0
            listOfIntegers.addFirst(12);

            // adicionando em index: listOfInteger.size();
            listOfIntegers.addLast(18);

            // Removendo todos que são maiores que 100;
            listOfIntegers.removeIf(x -> x > 100);

            listOfIntegers.iterator();

            for(Integer x : listOfIntegers) {
                System.out.println(x);
            }

            System.out.printf("----------------------------------------------------\n");

            // LinkedList
            // LinkedList: O(n) para acessar um elemento, pois pode ser necessário percorrer a lista.
            // Inserção e remoção são rápidas (O(1)) em qualquer posição, desde que você tenha a referência
            // do nó. Porém, encontrar o nó pode levar O(n) tempo.


            List<String>listOfStrings = new LinkedList<>();

            listOfStrings.add("Test1");
            listOfStrings.add("Test2");
            listOfStrings.add("Test3");
            listOfStrings.add("Test4");
            listOfStrings.add("Test5");
            listOfStrings.add("Test6");
            listOfStrings.add("Test7");

            listOfStrings.remove("Test5");

            listOfStrings.addFirst("TestAlpha");

        String elementToFind = "Test4";
        // Novo elemento a ser adicionado
        String newElement = "Luiz Otávio";

        // Encontrar o índice do elemento
        OptionalInt indexOpt = IntStream.range(0, listOfStrings.size()).filter(i -> listOfStrings.get(i).equals(elementToFind)).findFirst();

        // Adicionar o novo elemento depois do encontrado
        if (indexOpt.isPresent()) {
            int index = indexOpt.getAsInt();
            listOfStrings.add(index + 1, newElement);
        } else {
            System.out.println("Elemento não encontrado");
        }
    }
}
