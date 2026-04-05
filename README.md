# 🔁 Java Mastery: Estruturas de Repetição e Validação de Dados

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completo-brightgreen?style=for-the-badge)
![Academic](https://img.shields.io/badge/Academic-UNA-blue?style=for-the-badge)

Este repositório contém uma suite de **10 exercícios fundamentais** desenvolvidos em Java, focados no domínio de estruturas de controle de fluxo, lógica booleana e manipulação de dados via console.

---

## 📌 Sumário
1. [Visão Geral](#-visão-geral)
2. [Lista de Exercícios](#-lista-de-exercícios)
3. [Destaques Técnicos](#-destaques-técnicos)
4. [Como Executar](#-como-executar)
5. [Desenvolvedor](#-desenvolvedor)

---

## 🔍 Visão Geral
O projeto explora a fundo a resiliência de software através de **Data Validation** (Validação de Dados). Cada algoritmo foi projetado para ser "à prova de erros", utilizando laços de repetição que forçam a entrada correta por parte do usuário antes de proceder para a lógica de negócio.

---

## 📂 Lista de Exercícios

| Desafio | Descrição Técnica | Implementação |
| :--- | :--- | :--- |
| **01** | Validação de nota estrita entre 0 e 10. | `while(true)` + `break` |
| **02** | Sistema de segurança que impede senha igual ao usuário. | `String.equals()` |
| **03** | Formulário completo com checagem de tipos e tamanhos. | `length()` e `trim()` |
| **04** | Simulação matemática de crescimento populacional fixo. | Progressão Geométrica |
| **05** | Simulador de populações dinâmico com tratamento de taxas. | Loop Interativo |
| **06** | Manipulação de buffer de saída (Vertical vs Horizontal). | `print` vs `println` |
| **07** | Busca de maior valor em coleções numéricas. | Arrays e Vetores |
| **08** | Acumulador de soma e cálculo de média aritmética. | `for` loop iterativo |
| **09** | Filtro lógico para extração de números ímpares (1-50). | Operador de Módulo `%` |
| **10** | Gerador de intervalo inteligente entre dois inteiros. | `Math.min` e `Math.max` |

---

## 🛠️ Destaques Técnicos

Durante o desenvolvimento, foram aplicados conceitos avançados de algoritmos para otimizar o código:

* **Inteligência de Intervalo:** No `Exercicio_10.java`, utilizamos métodos da classe `Math` para garantir que o código funcione independentemente da ordem de digitação (crescente ou decrescente).
* **Sanitização de String:** Uso extensivo de `.trim()` e `.toLowerCase()` para evitar que espaços extras ou letras maiúsculas quebrem a lógica de comparação.
* **Prevenção de Loops Infinitos:** Lógica de controle rigorosa para garantir a saída do programa apenas após a satisfação de todas as condições de segurança.

---

## 🚀 Como Executar

Para rodar qualquer um dos exercícios localmente:

1.  **Clone o projeto:**
    ```bash
    git clone [https://github.com/seu-usuario/java-loops.git](https://github.com/seu-usuario/java-loops.git)
    ```
2.  **Compile o arquivo desejado:**
    ```bash
    javac Exercicio_10.java
    ```
3.  **Inicie a aplicação:**
    ```bash
    java Exercicio_10
    ```

---

## 👨‍💻 Desenvolvedor

**Lucas Nery Miranda**
🎓 Estudante de Ciência da Computação
🏛️ **UNA - Centro Universitário**

---
> *Projeto desenvolvido para a disciplina de Algoritmos e Programação.*
