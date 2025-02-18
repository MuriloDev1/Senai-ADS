![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 03: Estruturas de Decisão 

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é dominar a manipulação do fluxo de um algorítmo através de estruturas de decisão exercitando o raciocínio lógico para a criação de algoritmos.  

Estruturas de decisão em linguagens de programação, como if-else e switch, permitem que um programa execute diferentes blocos de código com base em condições específicas, tornando-o dinâmico e adaptável. Elas são essenciais para a lógica de controle, possibilitando a tomada de decisões automáticas com base em variáveis e entradas do usuário. Sem essas estruturas, os programas seriam sequenciais e incapazes de responder a diferentes cenários, limitando sua funcionalidade e utilidade.

Para mais informações acesse [Aula 04: Estruturas de decisão.](https://cainaantunes.notion.site/Aula-04-Estruturas-de-decis-o-189bde521b3b80d08502f505c356a0bb?pvs=4)

***

1. Receba um número real e caso ele seja positivo imprima sua raiz quadrada, casocontrário imprima a mensagem: “Valor inválido!”

2. O usuário entra com dois números inteiros e o programa indica qual o maior.

3. Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média. Se a média for menor que 50 imprimir “Reprovado” caso contrário imprimir “Aprovado”.

4. Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média. Se a médiafor maior ou igual a 50, exibir “Aprovado”, caso contrário solicitar ao usuário a nota daprova de recuperação, tirar nova média entre a média anterior e a prova de recuperação,se a nova média for menor que 50 exibir “Reprovado” caso contrário exibir “Aprovado”.

5. Elabore um programa que calcule a média de um aluno e imprima o conceito:
    - A se a média >= 8.5
    - B se a média >= 7 e média < 8.5
    - C se a média >= 5 e média < 7
    - D se a média < 5

6. Em um sistemas de caixa eletrônico o usuário deve escolher entre as opções de um menu escolhendo um número inteiro entre 5 e 9 inclusive. Crie um algoritmo que valide a entrada do usuário exibindo a opções escolhida ou a mensagem de opção inválida casoo usuário entre com um número fora do range estabelecido.

7. Receber os coeficientes $a$, $b$ e $c$ de uma equação do segundo grau e imprimir a solução($x_1$ e $x_2$). Equação do segundo grau: $ax^2+bx+c=0$. Exibir uma mensagem de aviso quando não houver raízes no conjunto de números Reais.

8. O usuário entra com um número inteiro e o programa indica se o número é ímpar ou par.

9. Dados três valores, verificar se eles podem ser valores dos lados de um triângulo. Se forem, imprima se é um triângulo equilátero, isósceles ou escaleno.
    >**Condição de existência de um triângulo**: <br>
    A medida de qualquer um dos lados de um triângulo deve ser menor do que a soma dos outros dois lados e maior que diferença entre essas mesmas medidas. <br>
    - **Triângulo equilátero:** possui todos os lados iguais.
    - **Triângulo isósceles:** possui apenas dois lados iguais.
    - **Triângulo escaleno**: todos os lados são diferentes.10. 
    
10. Receber três números inteiros e exibi-los em ordem crescente.

11. O usuário digita um número inteiro e o programa diz qual o dia da semana correspondente, por exemplo: 

    - 1 – domingo <br> 
    - 2 – segunda-feira <br> 
    - e assim por diante. <br>
    
12. Elaborar uma minicalculadora, o programa recebe 2 números e exibe um menu para que o usuário escolha a operação e em seguida exibe o resultado. Exemplo:

    ```plaintext
    Digite o primeiro numero: 2
    Digite o segundo numero: 3
    ------------------------------
    Menu:
        1. Soma
        2. Subtracao
        3. Multiplicacao
        4. Divisao
    ------------------------------
    Escolha uma opcao: 3
    ------------------------------
    Resultado: 2.0 x 3.0 = 6.0
    ```

13. Calculadora geométrica: exibir em um menu a opção de escolha entre três formageométricas: círculo, triangulo retângulo ou retângulo. Após a seleção da opção oprograma deverá solicitar que o usuário insira os dados necessário para realizar os cálculos de área e perímetro da forma selecionada, os resultados devem ser exibidos em seguida.Exemplo:

    ```plaintext 
    Menu:
        1. Círculo
        2. Triangulo Retângulo
        3. Retângulo
    --------------------------
    Escolha uma opção: 2
    --------------------------
    Informe a base: 3
    Informe a altura: 4
    --------------------------
    Área = 6
    Perímetro = 12
    ```

14. Crie um sistema de vendas onde o usuário insere o valor da compra e escolhe a formade pagamento que pode ser: débito, crédito ou pix. Após escolher a forma de pagamentoo sistema deve mostrar o total a pagar que deve seguir as seguintes regras:

    - **Débito:** Conceder desconto de 5%.
    - **Pix:** Conceder desconto de 10%.
    - **Crédito:** taxa de 2% do valor total em parcelamento até 4 vezes ou taxa de 5% do valor total em parcelamentos superiores a 4 vezes (limite 10x).

    Exemplo:

    ```plaintext
    Insira o valor da compra: 1000,00
    ----------------------------------
    Menu:
        1. Débito
        2. Pix
        3. Crédito
    ----------------------------------
    Escolha a forma de pagamento: 3
    ----------------------------------
    Crédito Selecionado
    ----------------------------------
    Escolha o número de parcelas: 6
    Valor final da compra: R$ 1050,00
    ```

15. Elabore um programa que simule o funcionamento de uma máquina de café, o usuário entra com o valor em reais, a máquina então apresenta um menu com as opções disponíveis e seus respectivos preços. Ao selecionar uma das opções a máquina informa a bebida selecionada e o troco calculado.

    Exemplo:
    
    ```plaintext
    Insira o dinheiro: 5,00
    ------------------------------
    Menu:
        1. Café Expresso R$ 0,50
        2. Café Longo R$ 1,00
        3. Capuccino R$ 2,50
        4. Chocolate R$ 2,00
    ------------------------------
    Escolha uma opção: 3
    ------------------------------
    Bebida selecionada: Capuccino
    Seu Troco: R$ 2,50
    ```



