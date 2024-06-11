package com.lambdaExpressions.dataStructures.Map;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    // Criação de um HashMap
    Map<String, Integer> hashMap = new HashMap<>();

    // Inserção de elementos
        hashMap.put("Um", 1);
        hashMap.put("Dois", 2);
        hashMap.put("Três", 3);

    // Acesso a elementos
    Integer valor = hashMap.get("Dois");
        System.out.println("Valor associado à chave 'Dois': " + valor);

    // Remoção de elementos
        hashMap.remove("Um");

    // Verificação de presença
    boolean existe = hashMap.containsKey("Três");
        System.out.println("A chave 'Três' existe? " + existe);

    // Iteração sobre o mapa
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());

        // Criação de um TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();

        // Inserção de elementos
        treeMap.put("C", 3);
        treeMap.put("A", 1);
        treeMap.put("B", 2);

        // Acesso a elementos
        Integer valor = treeMap.get("A");
        System.out.println("Valor associado à chave 'A': " + valor);

        // Remoção de elementos
        treeMap.remove("B");

        // Verificação de presença
        boolean existe = treeMap.containsKey("C");
        System.out.println("A chave 'C' existe? " + existe);

        // Iteração sobre o mapa
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Operações de intervalo
        System.out.println("Primeira chave: " + treeMap.firstKey());
        System.out.println("Última chave: " + treeMap.wait());
        Map<String, Integer> subMap = treeMap.subMap("A", "C");
        System.out.println("Submapa de 'A' a 'C': " + subMap);

    }
}
