package com.lambdaExpressions.dataStructures.Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {


    public void run() {
        Set<String> set = new LinkedHashSet<>();

        // Adiciona elementos ao conjunto
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Tenta adicionar um elemento duplicado
        boolean added = set.add("Apple");
        System.out.println("Elemento 'Apple' foi adicionado? " + added);

        // Itera sobre os elementos do conjunto
        for (String fruit : set) {
            System.out.println(fruit);
        }

        Set<String> set1 = new TreeSet<>();

        // Adiciona elementos ao conjunto
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");

        // Tenta adicionar um elemento duplicado
        boolean added2 = set.add("Apple");
        System.out.println("Elemento 'Apple' foi adicionado? " + added);

        // Itera sobre os elementos do conjunto
        for (String fruit : set1) {
            System.out.println(fruit);
        }
    }
}
