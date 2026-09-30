


# 🧮 Calculadora Java

Projeto de uma calculadora desenvolvida em Java, com operações matemáticas, histórico de cálculos e comandos para interação com o usuário pelo terminal.

## 📌 Sobre o projeto

A calculadora permite realizar operações básicas e também potenciação.

O projeto utiliza `enum`, `EnumMap`, `BiFunction` e expressões lambda para organizar e executar as operações matemáticas.

## ➕ Operações disponíveis

* `+` — Soma
* `-` — Subtração
* `*` — Multiplicação
* `/` — Divisão
* `pow` — Potenciação

## 💻 Funcionalidades

* Realização de operações matemáticas
* Validação de operação inválida
* Validação de divisão por zero
* Histórico das operações realizadas
* Comando para visualizar o histórico
* Comando para encerrar a calculadora

## ⌨️ Comandos

| Comando | Função                   |
| ------- | ------------------------ |
| `Enter` | Inicia uma nova operação |
| `-h`    | Exibe o histórico        |
| `.exit` | Encerra o programa       |

## 🛠️ Tecnologias utilizadas

* Java
* Enum
* EnumMap
* BiFunction
* Expressões Lambda
* ArrayList

## 📚 Estrutura do funcionamento

O programa utiliza um `EnumMap` para relacionar cada valor do `enum operacao` com uma função responsável por realizar o cálculo.

Exemplo:

```java
calculos.put(operacao.SOMA, (n1, n2) -> (double) (n1 + n2));
```

Quando uma operação é escolhida, o programa busca a função correspondente no `EnumMap` e executa o cálculo.

## 🧪 Exemplo de utilização

```text
Calculadora v1.0, digite .exit para sair, ou enter para continuar.

Digite o primeiro número:
10

Digite o segundo número:
5

Digite a operação desejada:
+ | Soma
- | Subtração
* | Multiplicação
/ | Divisão
pow | Elevação

+

15.0
```

### Histórico

Utilizando o comando:

```text
-h
```

O programa pode exibir:

```text
Histórico:
10.0 + 5.0 = 15.0
20.0 * 2.0 = 40.0
```

## 🎯 Objetivo

O objetivo do projeto é praticar conceitos de programação em Java e aplicar uma estrutura mais organizada para o gerenciamento das operações matemáticas utilizando `enum`, `EnumMap` e `BiFunction`.
