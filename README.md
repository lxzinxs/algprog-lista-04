# 🔁 Java Loop Control & Data Integrity: Domínio de Repetições

Este projeto reúne uma série de **10 laboratórios práticos** desenvolvidos em Java, focados na implementação de estruturas de repetição e na construção de algoritmos resilientes através da **validação rigorosa de dados (Data Sanitization)** e manipulação de fluxos dinâmicos.

---

## 🔍 O que foi explorado?

O objetivo deste repositório foi consolidar o uso de laços (`while`, `for`) e condicionais para criar softwares que não apenas calculam, mas que garantem a integridade da informação processada.

### 1. Validação e Persistência (Ex. 01 ao 03)
Implementação do padrão de "Loop Infinito Controlado". O programa utiliza `while(true)` para desafiar o usuário a inserir dados válidos, utilizando `break` apenas quando critérios como limites de idade, tamanho de strings e regras de login são satisfeitos.

### 2. Simulação e Fluxo Numérico (Ex. 04 ao 06)
Transição da lógica estática para a dinâmica. Exploramos o cálculo de tempo para ultrapassagem populacional (Progressão Geométrica) e a formatação de saída de dados no console, alternando entre buffers verticais (`println`) e horizontais (`print`).

### 3. Processamento de Coleções e Matemática (Ex. 07 ao 10)
Uso de arrays para armazenamento temporário e análise de dados. Implementamos algoritmos de busca de maior valor, cálculo de médias aritméticas, filtros lógicos (operador de módulo `%`) e o uso da classe `Math` para garantir que intervalos numéricos funcionem independentemente da ordem de entrada.

---

## 💻 Detalhamento da Lista Completa

| Exercício | Objetivo Técnico | Conceito Aplicado |
| :--- | :--- | :--- |
| **01** | Validar notas em intervalo estrito (0-10). | `while` + `if/else` |
| **02** | Bloqueio de credenciais (Senha != Usuário). | `String.equals()` |
| **03** | Validação complexa de formulário IHC. | `length()`, `trim()`, `charAt()` |
| **04** | Cálculo de crescimento populacional fixo. | Acumuladores e Taxas |
| **05** | Simulador populacional com inputs do usuário. | Interatividade Dinâmica |
| **06** | Manipulação de saída vertical (1 a 20). | `for` loop + `println` |
| **06.1** | Manipulação de saída horizontal (1 a 20). | `for` loop + `print` |
| **07** | Identificação de maior valor em conjunto. | Arrays e Iteração |
| **08** | Soma acumulada e média de 5 números. | Operações Aritméticas |
| **09** | Filtro de números ímpares entre 1 e 50. | Operador de Resto `%` |
| **10** | Gerador de intervalo numérico seguro. | `Math.min` e `Math.max` |

---

## 🛠️ Tecnologias e Ferramentas
* **Linguagem:** Java (JDK 17+).
* **Entrada de Dados:** Classe `java.util.Scanner`.
* **Lógica Matemática:** Classe `java.lang.Math` para prevenção de erros de limite.
* **Paradigma:** Programação Estruturada e Práticas de IHC (Interação Humano-Computador).

---

## 🚀 Como Executar
Cada exercício possui uma classe independente. Para testar o comportamento de validação:
1. Compile o arquivo: `javac Exercicio_10.java`
2. Execute: `java Exercicio_10`

---
**Desenvolvido por Lucas Nery Miranda**
*Estudante de Ciência da Computação - UNA*
