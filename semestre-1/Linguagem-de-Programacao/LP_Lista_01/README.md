![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Start )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |True| A[/ Aprovado /]
        verification --> |False| B[/ Reprovado /]
        A --> finish([ End ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
     flowchart TD
        start(( Start )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? && Frequencia >= 75%? }
        verification --> |True| A[/ Aprovado /]
        verification --> |False| B[/ Reprovado /]
        A --> finish([ End ])
        B --> finish

   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD

     start(( Start )) 
     --> A[\ Digite Primeiro Número \] 
     --> B[\Digite Segundo Número\]
     B --> C[Somar dois números]
     C --> D[/Exibir Resultado/] 

   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD

      start(( Início )) 
      --> A[\ Digite um número\] 
      A --> verification{Num >= 0?}

      verification --> |Sim| B[/Numero positivo/]
      verification --> |Não| C[/Numero negativo/]

      B --> finish((Finish))
      C --> finish

   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      start((Start))
      --> A[\Digite sua idade\]
      A --> verification{idade >= 18?}

      verification --> |True| B[/Pode votar/]
      verification --> |False| C[/Não pode votar/]

      B --> finish((Finish))
      C --> finish

   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start((Inicio))
      --> A[\Primeiro numero: \]
      A --> B[\Segundo numero: \]

      B --> verification{num1 > num2}
      verification --> |Sim| C[/Num1 Maior/]
      verification --> |Não| D[/Num2 Maior/]

      C --> finish((Finish))
      D --> finish

   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start((Inicio))
      --> A[\Digite 1° numero\]
      A --> B[\Digite 2° numero\]
      B --> C[\Digite 3° numero\]

      C --> verification1{num1 > num2?}

      verification1 --> |Sim| verification2{num1 > num3?}
      verification1 --> |Não| verification3{num2 > num3?}

      verification2 --> |Sim| D[/Num1 Maior/]
      verification2 --> |Não| F[/Num3 Maior/]

      verification3 --> |Sim| E[/Num2 Maior/]
      verification3 --> |Não| F[/Num3 Maior/]

      D --> finish((Finish))
      E --> finish
      F --> finish

   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      start((Start)) 
      --> A[\Insira um numero\]
      A --> B[Fatorial = 1]
      B --> C{Num > 1?}

      C --> |Sim| D[fatorial = fatorial * num]
      D --> E[Decrementar num = num - 1]
      E --> F

      F --> |Não| G[Exibir fatorial]
      G --> finish((Finish))
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   ```mermaid

   flowchart TD
   start((Start)) 
   --> A[\Insira um numero\]
   A --> B{num % 2 == 0?}

   B --> |Sim| C[/Par/]
   B --> |Não| D[/Ímpar/]

   C --> finish((Finish))   
   D --> finish

   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
flowchart TD
    start((Start)) 
    --> input[\ Digite o número \]
    input --> verification{num <= 1?}

    verification --> |Sim| A[/Não é primo/]
    verification --> |Não| C[Definir i = 2]

    C --> D{ i <= √num? }
    D --> |Não| E[/É primo/]
    D --> |Sim| F{num % i == 0?}
    
    F --> |Sim| B[/Não é primo/]
    F --> |Não| G[Incrementar i = i + 1]

    G --> D

    A --> finish([Finish])
    B --> finish
    E --> finish
```