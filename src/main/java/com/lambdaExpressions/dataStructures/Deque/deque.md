# Deque

## Overview

`Deque` (Double Ended Queue) é uma estrutura de dados que permite a inserção e remoção de elementos em ambas as extremidades, a frente e a traseira. Em Java, a interface `Deque` é implementada por várias classes, sendo as mais comuns `ArrayDeque` e `LinkedList`.

## Implementações Comuns

### ArrayDeque
### LinkedList

## Comparação das Implementações

| Característica                         | ArrayDeque                                        | LinkedList                                       |
|----------------------------------------|---------------------------------------------------|--------------------------------------------------|
| **Ordenação**                          | Nenhuma                                           | Nenhuma                                           |
| **Tempo de Acesso aos Elementos**      | O(1) (tempo constante)                            | O(n) (tempo linear)                              |
| **Complexidade de Inserção**           | O(1)                                              | O(1)                                             |
| **Complexidade de Remoção**            | O(1)                                              | O(1)                                             |
| **Uso de Memória**                     | Menos memória (array interno)                     | Mais memória (elementos + ponteiros)             |
| **Thread-Safety**                      | Não sincronizado                                  | Não sincronizado                                 |
| **Aplicações Típicas**                 | Implementação eficiente de deque, stack e fila    | Implementação de deque, stack e fila, inserção/remoção frequente |

## ArrayDeque

**Prós:**
- Muito eficiente para operações de deque.
- Não sincronizado, mas pode ser sincronizado externamente.
- Sem limites de capacidade, redimensiona conforme necessário.

**Contras:**
- Não permite elementos `null`.

**Usabilidade:**
- Ideal para a maioria das implementações de deque, pilha e fila devido à sua eficiência.
- Adequado para cenários onde operações rápidas de inserção e remoção em ambas as extremidades são necessárias.

## LinkedList (como Deque)

**Prós:**
- Simples de usar.
- Permite elementos `null`.
- Pode ser usado tanto como deque, pilha quanto como fila.

**Contras:**
- Maior consumo de memória devido aos ponteiros adicionais.
- Menos eficiente que `ArrayDeque` para operações de deque.

**Usabilidade:**
- Útil para implementações simples de deque, pilha e fila.
- Adequado para cenários onde é necessário acesso rápido e eficiente aos elementos.