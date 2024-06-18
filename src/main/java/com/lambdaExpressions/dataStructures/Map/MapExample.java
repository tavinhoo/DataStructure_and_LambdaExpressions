package com.lambdaExpressions.dataStructures.Map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    @Test
    public void run() {


        /*
        * TreeMap é ordenado pela interface compareTo ou comparator
        * ou seja, independente da ordem em que os itens forem adicionados
        * eles serão ordenados com base nisso.
        *
        * */
        Map<Integer, String> numbers = new TreeMap<>();

        numbers.put(1, "one");
        numbers.put(6, "six");
        numbers.put(9, "nine");
        numbers.put(4, "four");
        numbers.put(3, "tree");
        numbers.put(7, "seven");
        numbers.put(8, "eight");
        numbers.put(2, "two");
        numbers.put(5, "five");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("KEY: " + entry.getKey() + " VALUE: " + entry.getValue());
        }

        Map<Integer, String> names = new HashMap<>();

        names.put(1, "Otávio");
        names.put(2, "Otávio");
        names.put(3, "Otávio");
        names.put(4, "Otávio");
        names.put(5, "Otávio");
        names.put(6, "Otávio");
        names.put(7, "Otávio");


        Map<String, Double> accounts = new LinkedHashMap<>();

        accounts.put("Lucas", 10.000);
        accounts.put("Gustavo", 10.000);
        accounts.put("Silvia", 10.000);
        accounts.put("Bruna", 10.000);
        accounts.put("João", 7.213);
        accounts.put("Roberto", 5.021);
        accounts.put("Diego", 12.543);


    }

    // Método genérico para imprimir qualquer mapa
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("KEY: " + entry.getKey() + " VALUE: " + entry.getValue());
        }
    }
}
