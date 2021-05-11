# Learning-Stream-Java
Learning function stream, java language.
          -#####  STREAM  #####-
É uma sequencia de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas".
  • Fonte de dados: coleção, array, função de iteração, recurso de E/S
          
Stream é uma solução para processar sequências de dados de forma:
    • Declarativa (iteração interna: escondida do programador)
    • Parallel-friendly (imutável -> thread safe)
    • Sem efeitos colaterais•Sob demanda (lazy evaluation)
        
  • Acesso sequencial (não há índices)
  
  • Single-use: só pode ser "usada" uma vez
  
  • Pipeline: operações em streams retornam novas streams.
  
Então é possível criar uma cadeia de operações (fluxo de processamento).

    ----Operações intermediárias e terminais----
• O pipeline é composto por zero ou mais operações intermediárias e uma terminal.

• Operação intermediária: 
  • Produz uma nova streams (encadeamento)
  • Só executa quando uma operação terminal é invocada (lazy evaluation)

• Operação terminal:
  • Produz um objeto não-stream (coleção ou outro)
  • Determina o fim do processamento da stream

    ----Operações intermediárias----
  • filter
  • map
  • flatmap
  • peek 
  • distinct
  • sorted
  • skip
  • limit (*)
  
    (*) short-circuit
    
    ----Operações Terminais----    
  • forEach
  • forEachOrdered
  • toArray
  • reduce
  • collect
  • min
  • max
  • count
  • anyMatch(*)
  • allMatch(*)
  • noneMatch(*)
  • findFirst(*)
  • findAny(*)
  
      (*) short-circuit
