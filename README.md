# APA - Atividade de Aprendizagem - Programação Orientada a Objetos
Este repositório contém o código desenvolvido como parte da Atividade de Aprendizagem (APA) do Curso de Bacharelado em Sistema de Informação, do Centro Universitário Unifatecie, no terceiro semestre.

##

## Descrição do Projeto

O projeto "apa_testeperformance" foi desenvolvido em resposta a uma solicitação do Gerente de Projetos. Ele solicitou o desenvolvimento de um código em Java, com ênfase em Programação Orientada a Objetos, para avaliar a performance de diferentes estruturas de dados. O objetivo é inserir 30 mil números em um ArrayList e em um HashSet, respectivamente, e cronometrar o tempo gasto em cada caso.

Após o desenvolvimento do código, o analista de teste foi encarregado de avaliar sua performance e preencher uma tabela com os resultados. Esta tabela inclui os seguintes campos: "Métodos", "Descrição" e "Melhor Performance", para identificar qual estrutura de dados apresenta o melhor desempenho.

##

## Implementação e Testes

Para executar o projeto, basta replicar o código apresentado neste repositório em uma IDE de desenvolvimento como o Visual Studio Code. Realize testes variando os valores de entrada (30 mil, 50 mil, 100 mil, 150 mil e 200 mil) para analisar o desempenho de cada estrutura de dados.

## Resultados

| Método      | Descrição                                                                         | Melhor Performance                                                        |
|-------------|-----------------------------------------------------------------------------------|---------------------------------------------------------------------------|
| ArrayList<> | Implementar uma lista redimensionável, mantendo a ordem de inserção dos elementos.  | Depende do tipo de operação realizada e do tamanho dos dados. Para operações que envolvem acesso por índice, ArrayList geralmente tem melhor performance.|                                                                           
| HashSet<>   | Implementar um conjunto que não permite elementos duplicados, utilizando uma tabela de dispersão para armazenar os elementos. Não mantém a ordem de inserção.| Geralmente tem melhor performance para operações de busca e inserção de elementos únicos, especialmente quando a busca é realizada com frequência. |

| Método      | Testando 50,000 elementos         | Tempo gasto                         |
|-------------|-----------------------------------|-------------------------------------|
| ArrayList<> |                                   | 2223ms                             |                                                                           
| HashSet<>   |                                   | 31ms                               |

| Método      | Testando 100,000 elementos        | Tempo gasto                         |
|-------------|-----------------------------------|-------------------------------------|
| ArrayList<> |                                   | 11124ms                             |                                                                           
| HashSet<>   |                                   | 25ms                               |

| Método      | Testando 150,000 elementos        | Tempo gasto                         |
|-------------|-----------------------------------|-------------------------------------|
| ArrayList<> |                                   | 26562ms                           |                                                                           
| HashSet<>   |                                   | 26 ms                               |

| Método      | Testando 200,000 elementos        | Tempo gasto                         |
|-------------|-----------------------------------|-------------------------------------|
| ArrayList<> |                                   | 51405 ms                           |                                                                     
| HashSet<>   |                                   | 29ms                               |

![APA-Resultados-TP-VSCODE](https://github.com/alexsabrasil/apa_testaperformance/assets/113733583/023a2722-9dd3-4206-aec5-8f86e2f6078a)


## Melhorias

- Pretendo criar uma página simples que irá exibir os resultados.

##

### Autora
- Alexsandra Tavares

##

### Sugestões serão bem-vindas!

Este projeto está aberto a sugestões e contribuições para melhorias e otimizações.
Entre em contato caso tenha alguma sugestão ou dúvida. 
  


