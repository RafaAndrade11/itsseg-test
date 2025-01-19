# EXPLICAÇÕES TESTE JAVA JUNIOR ITSSEG

## Exercício 1 - Verificando se uma frase é pangramática

 - Através da função 'checkSentenceIsPangrammatic' é verificado se uma frase é ou não pangramática, retornando true ou false.
 Defini todas as letras do alfabeto em uma variável, setei a minha frase para letras minúsculas e percorrendo em um loop foreach
 foi verificado se todas as letras estavam presentes. Caso não, retornaria false. Caso sim, retornaria true.

## Exercício 2 - Remover vogais de comentários ofensivos

- Através da função 'removingVowelsInOffensiveComments' é removido as vogais da frase ofensiva.
  Seguindo a mesma lógica do exercício um, defini todas as vogais (minusculas e maiusculas) em uma variavel, e percorri a frase
  adicionando os caracteres que não são vogais um a um.

## Exercício 3 - Encontrar o maior e o menor número em uma sequência
- Através da função 'findHighestAndLowestNumber' é encontrado o maior e menor número dado uma sequência separada por espaços.
  Tendo em vista que é dado pelo usuário números separados por espaço, é dividido os números através do .split, criando um array.
  Convertendo os números inteiros, é percorrida a String e é comparado o valor atual com o maior e o menor já definido anteriormente. 
  Com isso, bastou returnar ambos no final separados por espaço.

## Exercício 4 - Verificar se uma string termina com outra
- Através da função 'checkFirsStringEndsWithSecondString' é verificado se a primeira string termina com a segunda.
  Primeiro é feita uuma comparação se a segunda string é maior que a primeira, caso seja já retorna false.
  Após isso, foi utilizado o substring() passando como parâmetro o tamanho da primeira string menos o tamanho da segunda string.
  Bastou usar um equals para verificar e retornar o true caso seja e o false caso não seja. 

## Exercício 5 - Inverter palavras em uma frase
- Através da função 'reverseWordsInASentence' é invertida palavras em uma frase, mantendo as palavras na ordem que está.
  Nessa função, é necessário separar as palavras em um array, utilizando o split. Com as frases separdas, é feito um foreach
  para reverter utilizando o StringBuilder e adicionar o espaço entre elas.
  Obs: Ajustado código após a falha no test, estava falhando pois estava lançando um espaço a mais na prieira palavra.

## Exercício 6 - Fechando em soma
- Através da função 'returnSumOfDigits' é feita a soma conforme solicitado.
  Para manipularmos, foi convertido para String. Inicializamos então as variaveis "sum", "start" e "end" (este bastando pegar o tamanho
  da string -1 que é a posição correta). Após isso, é feito um loop while para verificar quando o "start" não ultrapasse o "end".
  Se não forem iguais: é um par de números, então pegamos ambos os digitos e forma uma dezena, assim já somando com a variável "sum".
  Se forem iguais: significa que estamos no meio de um número ímpar, então basta pegar este número e adicionar a variável "sum".
