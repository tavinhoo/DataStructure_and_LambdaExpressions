# Set

## Overview

Um `Set` é uma coleção que não permite elementos duplicados. Em Java, a interface `Set` é implementada por várias classes que oferecem diferentes características e funcionalidades.

## Implementações Comuns

### HashSet
### LinkedHashSet
### TreeSet

## Comparação das Implementações

| Característica                         | HashSet                                           | LinkedHashSet                                     | TreeSet                                            |
|----------------------------------------|---------------------------------------------------|---------------------------------------------------|---------------------------------------------------|
| **Ordenação**                          | Não mantém ordem                                  | Mantém a ordem de inserção                         | Mantém a ordem natural ou definida por `Comparator`|
| **Tempo de Acesso aos Elementos**      | O(1)                                              | O(1)                                              | O(log n)                                           |
| **Complexidade de Inserção**           | O(1)                                              | O(1)                                              | O(log n)                                           |
| **Complexidade de Remoção**            | O(1)                                              | O(1)                                              | O(log n)                                           |
| **Uso de Memória**                     | Menos memória                                     | Mais memória devido ao encadeamento                | Mais memória devido à árvore de busca binária      |
| **Thread-Safety**                      | Não sincronizado                                  | Não sincronizado                                  | Não sincronizado                                  |
| **Aplicações Típicas**                 | Coleções que não precisam manter ordem            | Coleções onde a ordem de inserção é importante     | Coleções que precisam de ordenação                 |

## HashSet

**Prós:**
- Operações muito rápidas para inserção, remoção e verificação de presença de elementos.
- Ideal para cenários onde a ordem dos elementos não é importante.

**Contras:**
- Não mantém nenhuma ordem dos elementos.
- Não é thread-safe sem sincronização externa.

**Usabilidade:**
- Recomendado para coleções onde a unicidade dos elementos é importante, mas a ordem não importa.
- Adequado para cenários onde a performance é crucial.

## LinkedHashSet

**Prós:**
- Mantém a ordem de inserção dos elementos.
- Oferece todas as vantagens do `HashSet` com a adição de manter a ordem.

**Contras:**
- Mais memória devido ao encadeamento adicional.
- Não é tão rápido quanto `HashSet` devido ao overhead de manutenção da ordem.

**Usabilidade:**
- Útil para coleções onde a ordem de inserção é importante.
- Adequado para cenários onde a ordem e a unicidade dos elementos são cruciais.

## TreeSet

**Prós:**
- Mantém os elementos em ordem natural ou baseada em um `Comparator` fornecido.
- Ideal para cenários onde a ordenação é importante.

**Contras:**
- Operações de inserção, remoção e acesso são mais lentas (O(log n)) devido à manutenção da árvore de busca binária.
- Mais memória devido à árvore de busca binária.

**Usabilidade:**
- Recomendado para coleções que precisam ser mantidas em ordem.
- Adequado para cenários onde a ordenação e a unicidade dos elementos são cruciais.