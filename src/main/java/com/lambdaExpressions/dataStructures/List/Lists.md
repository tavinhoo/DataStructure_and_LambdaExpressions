<h1 align="center"> LIST </h1>
<hr> 
<h3 align="center"> ArrayList e LinkedList </h3>
<hr> 

| Característica                         | ArrayList                                         | LinkedList                                       |
|----------------------------------------|---------------------------------------------------|--------------------------------------------------|
| **Estrutura de Dados Subjacente**      | Array dinâmico                                    | Lista duplamente ligada                          |
| **Tempo de Acesso aos Elementos**      | O(1) (tempo constante)                            | O(n) (tempo linear)                              |
| **Tempo de Inserção/Remoção no Início**| O(n) (tempo linear)                               | O(1) (tempo constante)                           |
| **Tempo de Inserção/Remoção no Meio**  | O(n) (tempo linear)                               | O(1) (tempo constante, assumindo que o nó é conhecido) |
| **Tempo de Inserção/Remoção no Fim**   | O(1) (tempo constante)                            | O(1) (tempo constante)                           |
| **Uso de Memória**                     | Menos memória (apenas elementos e overhead fixo)  | Mais memória (elementos + ponteiros para nós anteriores e seguintes) |
| **Redimensionamento**                  | Automaticamente redimensionado quando necessário (geralmente dobra de tamanho) | Não requer redimensionamento (os nós são alocados conforme necessário) |
| **Iteração**                           | Mais rápida devido ao acesso direto por índice    | Mais lenta devido à necessidade de percorrer os nós |
| **Aplicações Típicas**                 | Acesso rápido, poucas inserções/remoções no meio  | Inserções/remoções frequentes, especialmente no início/meio da lista |

## ArrayList

**Prós:**
- Acesso rápido aos elementos por meio de índices.
- Boa performance em operações de acesso e alteração de elementos em posições específicas.
- Ótimo para situações em que a maior parte das operações é leitura de elementos.

**Contras:**
- Inserções e remoções no meio da lista podem ser lentas.
- Redimensionamento do array interno pode ser custoso em termos de tempo.

**Usabilidade:**
- Recomendado quando a ênfase está na leitura de elementos ou quando a estrutura de dados precisa ser acessada por índices.
- Adequado para situações em que o tamanho da lista é conhecido ou pode ser previsto.

## LinkedList

**Prós:**
- Inserções e remoções rápidas em qualquer posição da lista.
- Baixo custo para adicionar ou remover elementos no início ou no fim da lista.
- Não precisa de redimensionamento, aloca memória conforme necessário.

**Contras:**
- Acesso menos eficiente aos elementos por índices.
- Maior consumo de memória devido aos ponteiros adicionais.

**Usabilidade:**
- Ideal quando as operações de inserção e remoção são frequentes e o acesso aos elementos por índices não é crítico.
- Adequado para situações em que o tamanho da lista é desconhecido ou pode variar.
