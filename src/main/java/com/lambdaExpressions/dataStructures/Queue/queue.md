# Queue

## Overview

As filas (Queues) são estruturas de dados lineares que seguem o princípio FIFO (First In, First Out), onde o primeiro elemento inserido é o primeiro a ser removido. Em Java, as interfaces `Queue` e `Deque` (Double Ended Queue) são implementadas por várias classes que oferecem diferentes características e funcionalidades.

## Implementações Comuns

### PriorityQueue
### LinkedList (como uma fila)
### ArrayDeque

## Comparação das Implementações

| Característica                         | PriorityQueue                                      | LinkedList (Queue)                                  | ArrayDeque                                           |
|----------------------------------------|---------------------------------------------------|---------------------------------------------------|---------------------------------------------------|
| **Ordenação**                          | Ordem natural ou personalizada através de `Comparator` | FIFO (First In, First Out)                           | FIFO (First In, First Out)                          |
| **Tempo de Acesso aos Elementos**      | O(log n) para inserção e remoção de elementos     | O(1) para operações básicas                       | O(1) para operações básicas                       |
| **Complexidade de Inserção**           | O(log n)                                           | O(1)                                               | O(1)                                               |
| **Complexidade de Remoção**            | O(log n)                                           | O(1)                                               | O(1)                                               |
| **Uso de Memória**                     | Baseado em heap (mais memória devido à árvore de prioridade) | Menos memória comparado ao PriorityQueue           | Menos memória comparado ao PriorityQueue           |
| **Thread-Safety**                      | Não sincronizado                                   | Não sincronizado                                   | Não sincronizado                                   |
| **Aplicações Típicas**                 | Cenários onde a ordem de processamento é baseada em prioridade | Cenários FIFO básicos e implementações de listas ligadas | Alternativa mais eficiente para LinkedList quando usado como fila |

## PriorityQueue

**Prós:**
- Mantém os elementos em ordem natural ou de acordo com um `Comparator` fornecido.
- Ideal para cenários onde a prioridade dos elementos é crucial.

**Contras:**
- Operações de inserção e remoção são mais lentas (O(log n)) devido à manutenção da ordem.
- Não permite elementos `null`.

**Usabilidade:**
- Recomendado quando a prioridade dos elementos é importante.
- Adequado para algoritmos de pathfinding (ex: Dijkstra), gerenciamento de tarefas, etc.

## LinkedList (Queue)

**Prós:**
- Implementação simples e intuitiva.
- Operações de inserção, remoção e acesso aos elementos são rápidas (O(1)).

**Contras:**
- Pode consumir mais memória devido aos ponteiros adicionais.
- Não é tão eficiente quanto `ArrayDeque` para operações de fila.

**Usabilidade:**
- Útil para implementações simples de fila FIFO.
- Adequado para cenários onde a simplicidade e a compatibilidade com outras operações de lista são importantes.

## ArrayDeque

**Prós:**
- Muito eficiente para operações de fila (melhor que `LinkedList`).
- Pode ser usado tanto como fila quanto como deque (fila dupla).

**Contras:**
- Capacidade inicial fixa, embora possa ser redimensionada automaticamente.
- Não permite elementos `null`.

**Usabilidade:**
- Ideal para a maioria das implementações de fila devido à sua eficiência.
- Adequado para cenários onde é necessário acesso rápido e eficiente a ambos os extremos da fila.
