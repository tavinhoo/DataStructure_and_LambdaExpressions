<h1 align="center"> MAP </h1>
<hr> 
<h3 align="center"> HashMap, TreeMap e LinkedHashMap </h3>
<hr> 

| Característica                         | HashMap                                          | TreeMap                                        | LinkedHashMap                                 |
|----------------------------------------|--------------------------------------------------|-----------------------------------------------|----------------------------------------------|
| **Estrutura de Dados Subjacente**      | Tabela Hash                                      | Árvore Red-Black                              | Tabela Hash + Lista Duplamente Ligada        |
| **Ordenação dos Elementos**            | Não mantém a ordem                               | Mantém a ordem natural das chaves             | Mantém a ordem de inserção                   |
| **Tempo de Acesso aos Elementos**      | O(1) (tempo constante)                           | O(log n) (tempo logarítmico)                  | O(1) (tempo constante)                       |
| **Tempo de Inserção/Remoção**          | O(1) (tempo constante)                           | O(log n) (tempo logarítmico)                  | O(1) (tempo constante)                       |
| **Uso de Memória**                     | Menos memória (apenas elementos e overhead fixo) | Mais memória (elementos + nós da árvore)      | Mais memória (elementos + ponteiros para nós anteriores e seguintes) |
| **Suporte a Operações de Intervalo**   | Não                                              | Sim                                           | Não                                           |
| **Iteração**                           | Mais rápida devido ao acesso direto por hash     | Mais lenta devido à travessia da árvore       | Mais lenta devido à manutenção da ordem de inserção |
| **Aplicações Típicas**                 | Busca rápida por chave                           | Necessidade de ordenar chaves ou operações de intervalo | Ordem previsível de iteração                |

## HashMap

**Prós:**
- Acesso rápido aos elementos por meio de chaves.
- Boa performance em operações de inserção, remoção e acesso.
- Ideal para busca rápida e quando a ordem dos elementos não é importante.

**Contras:**
- Não mantém a ordem dos elementos.
- Pode ter problemas de desempenho em casos de muitas colisões de hash.
- Não suporta operações de intervalo.

**Usabilidade:**
- Recomendado quando a ênfase está em acesso rápido a elementos por chave.
- Adequado para situações em que a ordem das chaves não é relevante.

## TreeMap

**Prós:**
- Mantém os elementos ordenados de acordo com a ordem natural das chaves ou um comparador.
- Suporta operações de intervalo como `subMap`, `headMap`, e `tailMap`.
- Ideal para cenários onde a ordenação das chaves é importante.

**Contras:**
- Acesso e operações mais lentas em comparação com `HashMap` devido à necessidade de manter a árvore balanceada.
- Maior consumo de memória devido à estrutura de árvore.

**Usabilidade:**
- Ideal quando a ordenação das chaves é importante ou necessário.
- Adequado para situações onde operações de intervalo são frequentes.

## LinkedHashMap

**Prós:**
- Mantém a ordem de inserção dos elementos.
- Acesso rápido aos elementos por meio de chaves.
- Pode ser configurado para manter a ordem de acesso (mais recentemente acessado primeiro).

**Contras:**
- Uso de memória adicional devido à manutenção da lista duplamente ligada.
- Ligeiramente mais lento que `HashMap` devido à manutenção da ordem de inserção.

**Usabilidade:**
- Recomendado quando a ordem de inserção dos elementos é importante.
- Adequado para situações onde a previsibilidade da ordem de iteração é necessária.
- Útil para criar caches e implementações de LRU (Least Recently Used).
