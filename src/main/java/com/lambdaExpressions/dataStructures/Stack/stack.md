# Stack

## Overview

A pilha (Stack) é uma estrutura de dados linear que segue o princípio LIFO (Last In, First Out), onde o último elemento inserido é o primeiro a ser removido. Em Java, a classe `Stack` é uma extensão da classe `Vector`, e oferece métodos para manipular a pilha.

## Implementações Comuns

### Stack
### Deque (ArrayDeque e LinkedList)

## Comparação das Implementações

| Característica                         | Stack                                             | ArrayDeque (como Stack)                           | LinkedList (como Stack)                            |
|----------------------------------------|---------------------------------------------------|---------------------------------------------------|---------------------------------------------------|
| **Ordenação**                          | LIFO (Last In, First Out)                         | LIFO (Last In, First Out)                         | LIFO (Last In, First Out)                         |
| **Tempo de Acesso aos Elementos**      | O(1)                                              | O(1)                                              | O(1)                                              |
| **Complexidade de Inserção**           | O(1)                                              | O(1)                                              | O(1)                                              |
| **Complexidade de Remoção**            | O(1)                                              | O(1)                                              | O(1)                                              |
| **Uso de Memória**                     | Mais memória (devido ao overhead de `Vector`)     | Menos memória                                     | Menos memória                                     |
| **Thread-Safety**                      | Sincronizado                                      | Não sincronizado                                  | Não sincronizado                                  |
| **Aplicações Típicas**                 | Cenários LIFO básicos, compatibilidade com código legado | Alternativa mais eficiente para `Stack`           | Alternativa mais eficiente para `Stack`           |

## Stack

**Prós:**
- Simples de usar.
- Sincronizado (thread-safe).

**Contras:**
- Menos eficiente devido ao overhead da classe `Vector`.
- Geralmente não recomendado para novos projetos devido à disponibilidade de alternativas mais eficientes.

**Usabilidade:**
- Recomendado para cenários onde a sincronização é necessária.
- Adequado para compatibilidade com código legado.

## ArrayDeque (como Stack)

**Prós:**
- Muito eficiente para operações de pilha.
- Não sincronizado, mas pode ser sincronizado externamente.

**Contras:**
- Capacidade inicial fixa, embora possa ser redimensionada automaticamente.
- Não permite elementos `null`.

**Usabilidade:**
- Ideal para a maioria das implementações de pilha devido à sua eficiência.
- Adequado para cenários onde operações rápidas de empilhar e desempilhar são necessárias.

## LinkedList (como Stack)

**Prós:**
- Simples de usar.
- Pode ser usado tanto como pilha quanto como fila.

**Contras:**
- Maior consumo de memória devido aos ponteiros adicionais.
- Não tão eficiente quanto `ArrayDeque` para operações de pilha.

**Usabilidade:**
- Útil para implementações simples de pilha.
- Adequado para cenários onde é necessário acesso rápido e eficiente aos elementos.

## Exemplo de Código

### Stack

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Adiciona elementos à pilha
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Acessa o topo da pilha
        System.out.println("Topo da pilha: " + stack.peek());

        // Remove elementos da pilha
        while (!stack.isEmpty()) {
            System.out.println("Removido: " + stack.pop());
        }
    }
}
