![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 05: Vetores e Matrizes. 

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é compreender como os dados podem ser armazenados e manipulados em estruturas de vetores e matrizes.

Vetores e matrizes são estruturas de dados que armazenam múltiplos valores de um mesmo tipo, permitindo organização e acesso eficiente às informações. Vetores são unidimensionais, enquanto matrizes possuem duas ou mais dimensões, sendo fundamentais para representar tabelas, imagens e cálculos matemáticos. Seu uso otimiza o processamento de dados, possibilitando operações em larga escala e facilitando a manipulação de grandes conjuntos de informações em algoritmos e aplicações diversas.

Para mais informações acesse [Aula 06: Vetores e Matrizes.](https://cainaantunes.notion.site/Aula-06-Vetores-189bde521b3b8086b846fa65fc665a0b?pvs=4)

***

1. Declare e inicialize um vetor de 10 posições, em seguida imprima este vetor em ordem inversa.

2. Declare e inicialize um vetor de 10 posições, em seguida percorra este vetor alterando seus valores conforme a seguinte regra: some 2 a todos os valores situados em posições com índice par e para as posições de índice ímpar multiplique seu valores por 2.

3. Crie um programa que contenha um vetor de inteiros de 10 posições (inicializar o vetor junto com sua declaração). O programa deve solicitar ao usuário um número inteiro(armazenar em uma variável comum inteira) e então realizar uma busca dentro do vetor.Caso a variável digitada exista dentro do vetor, exibir sua posição no vetor caso contrário exibir a mensagem “Valor não encontrado”.

4. Crie um programa que armazene 10 números inteiros inseridos pelo usuário em um vetor. Em seguida, percorra o vetor e indique onde estão o maior e o menor número (imprima seus valores e suas posições no vetor).

5. Crie um programa que possua um vetor de 10 posições com os seguintes valores inteiros armazenados: 
    
    ```java
    int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    ```

    Quando executado o programa deve criar uma cópia “invertida” em um segundo vetor e em seguida exibir ambos os vetores

6. Declare e inicialize um vetor, em seguida inverta a sequência dos valores armazenados neste mesmo vetor. 
    
    > <font color="red"> **Restrição:** utilizar apenas um vetor e uma variável auxiliar </font>

7. Receber uma matriz 5x5 e encontrar a maior soma entre suas colunas e a maior somaentre suas linhas.

8. Declare e inicialize uma matriz 5x5 em seguida exiba sua diagonal principal.

9. Declare e inicialize uma matriz 5x5 em seguida exiba sua diagonal secundária.

10. Declare e inicialize duas matrizes uma 3x2 e outra 2x2, em seguida gere a matriz produto entre as duas matrizes.
Exemplo de como calcular a matriz produto:

    $
    \begin{bmatrix}
    a_{11} & a_{12} \\
    a_{21} & a_{22} \\
    a_{31} & a_{32} \\
    \end{bmatrix}.
    \begin{bmatrix}
    b_{11} & b_{12} \\
    b_{21} & b_{22} \\
    \end{bmatrix}=
     \begin{bmatrix}
    a_{11}.b_{11}+a_{12}.b_{21} & a_{11}.b_{12}+a_{12}.b_{22} \\
    a_{21}.b_{11}+a_{22}.b_{21} & a_{21}.b_{12}+a_{22}.b_{22} \\
    a_{31}.b_{11}+a_{32}.b_{21} & a_{31}.b_{12}+a_{32}.b_{22} \\
    \end{bmatrix}
    $

11. Aperfeiçoe o exercício anterior solicitando para que o usuário informe o tamanho das matrizes a serem multiplicadas. 

    Valide se é possível calcular a matriz produto.

    > A multiplicação de matrizes só é possível quando o número de colunas da primeira matrizé igual ao número de linhas da segunda matriz. 
    
    Se a multiplicação existir, a matriz produto terá a quantidade de linhas da primeira matriz e a quantidade de colunas da segundamatriz.
    
    Após a validação peça para o usuário inserir os valores de cada matriz e então gere amatriz produto
    
12. Declare e inicialize uma matriz 3x3 e calcule a sua determinante.