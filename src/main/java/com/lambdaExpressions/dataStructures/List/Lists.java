package com.lambdaExpressions.dataStructures.List;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {

    @Test
    public void run() {

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

        for(Integer x : listOfIntegers) {
            System.out.println(x);
        }
        
    }

}
