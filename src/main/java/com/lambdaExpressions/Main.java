package com.lambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Uso com Interfaces Funcionais

        Runnable runnable = () -> System.out.println("Running in a lambda expression!");
        new Thread(runnable).start();

        // Iteração sobre coleções

        List<String> list2 = Arrays.asList("one", "two", "three");
        list2.forEach(System.out::println);

        // Uso com streams

        List<String> list3 = Arrays.asList("one", "two", "three");
        List<String> filteredList = list3.stream()
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toList());
        System.out.println(filteredList); // [two, three]

        // Comparadores customizados

        List<String> list4 = Arrays.asList("one", "two", "three");
        list4.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(list4); // [one, two, three

       /********** Supplier, Consumer, Predicate e Funcion *********/

        // Supplier
        Supplier<String> supplier = () -> "Hello, World!";
        System.out.println(supplier.get());

        // Consumer
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Hello, World!");

        // Predicate
        Predicate<String> predicate = (s) -> s.length() > 3;
        System.out.println(predicate.test("Hello")); // true

        // Function
        Function<String, Integer> function = (s) -> s.length();
        System.out.println(function.apply("Hello")); // 5

        /* Mapeamento e Redução */
        List<String> list5 = Arrays.asList("one", "two", "three");
        List<Integer> lengths = list5.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(lengths); // [3, 3, 5]


    }
}