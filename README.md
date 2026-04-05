# 🔁 Java Loop Control & Data Integrity: Domínio de Repetições

Este projeto reúne uma série de **10 laboratórios práticos** desenvolvidos em Java, focados na implementação de estruturas de repetição e, principalmente, na construção de algoritmos resilientes através da **validação rigorosa de dados (Data Sanitization)**.

---

## 🔍 O que foi explorado?

O objetivo principal desta lista foi transicionar da lógica sequencial simples para fluxos de controle dinâmicos, onde o programa interage com o usuário até que critérios de integridade sejam atendidos.

### 1. Lógica de Validação Persistente
Em exercícios como o de **Notas (`Exercicio_01`)** e **Formulário (`Exercicio_03`)**, aplicamos o padrão de "Loop Infinito Controlado":
* **Padrão:** O programa entra em um `while(true)` e só libera o fluxo através do comando `break` quando todas as regras de negócio (como idade entre 0-150 ou nome > 3 caracteres) são satisfeitas.

### 2. Simulação de Crescimento Dinâmico
Nos exercícios de **População (`Exercicio_04` e `05`)**, exploramos cálculos iterativos para prever eventos futuros baseados em taxas percentuais, evoluindo de um cenário estático para um simulador onde o usuário define todas as variáveis de entrada.

### 3. Manipulação de Intervalos e Coleções
* **Ordenação Inteligente:** No `Exercicio_10`, utilizamos os métodos `Math.min()` e `Math.max()` para garantir que o intervalo numérico fosse impresso corretamente, independentemente da ordem em que o usuário inseriu os valores.
* **Processamento de Arrays:** Implementamos algoritmos de busca (Maior valor) e acumuladores (Soma e Média) utilizando vetores de tamanho fixo.

---

## 💻 Destaques do Portfólio

| Exercício | Foco Técnico | Diferencial Aplicado |
| :--- | :--- | :--- |
| **Login Seguro** | `Exercicio_02` | Bloqueio de credenciais idênticas (User == Pass). |
| **Validação IHC** | `Exercicio_03` | Checagem múltipla de tipos (String, Int, Double, Char). |
| **Simulador Pop** | `Exercicio_05` | Validação de taxas negativas e cálculo de anos. |
| **Filtro Lógico** | `Exercicio_09` | Uso do operador de módulo `%` para extração de ímpares. |
| **Intervalo Seguro** | `Exercicio_10` | Prevenção de erro de limite superior < inferior via `Math`. |

---

## 🛠️ Tecnologias e Ferramentas
* **Linguagem:** Java (JDK 17+).
* **Entrada de Dados:** Classe `java.util.Scanner`.
* **Biblioteca Matemática:** `java.lang.Math` para lógica de comparação e potências.
* **Versionamento:** Git/GitHub para gestão de repositório.

---

## 🚀 Como Executar
Cada exercício é uma classe independente com seu próprio método `main`. Para testar:
1. Compile o arquivo: `javac Exercicio_10.java`
2. Execute: `java Exercicio_10`

---
**Desenvolvido por Lucas Nery Miranda**
*Estudante de Ciência da Computação - UNA*
