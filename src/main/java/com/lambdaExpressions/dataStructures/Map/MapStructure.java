package com.lambdaExpressions.dataStructures.Map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapStructure {

    @Test
    public void run() {


        /*
        * TreeMap é ordenado pela interface compareTo ou comparator
        * ou seja, independente da ordem em que os itens forem adicionados
        * eles serão ordenados com base nisso.
        * */
        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "one");
        map.put(6, "six");
        map.put(9, "nine");
        map.put(4, "four");
        map.put(3, "tree");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(2, "two");
        map.put(5, "five");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("KEY: " + entry.getKey() + " VALUE: " + entry.getValue());
        }




    }
}
