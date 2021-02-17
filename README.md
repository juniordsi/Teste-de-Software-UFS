# Testes Automatizados
![Java](https://img.shields.io/badge/-Java-007396?style=flat-square&logo=java)
![JUnit](https://img.shields.io/badge/-JUnit-green?style=flat-square&logo=java)
![Git](https://img.shields.io/badge/-Git-black?style=flat-square&logo=git)

[![ReadMe Card](https://github-readme-stats.vercel.app/api/pin/?username=juniordsi&repo=Teste-de-Software-UFS&show_owner=true&show_icons=true&theme=dark&langs_count=10)](https://github.com/anuraghazra/github-readme-stats)


Laboratórios desenvolvidos durante a disciplina de Teste de Software do Departamento de Computação, Dcomp, da Universidade Federal de Sergipe, no período 2020.1.

## Teste de Software
A prevenção e o fornecimento de diagnósticos claros para correção de erros, e a identificação dos sintomas provocados por bugs são os principais objetivos dos testes de software. 

### O que é testar?
- É executar um programa com o objetivo de validar seu comportamento dinâmico.
- É checar se o software é realmente o que o usuário quer.

### Porque testar?
Além de assegurar a qualidade do software, a prática de testes reduz de forma considerável custos, geralmente altos, que são consequências de falhas de software.

### Diferença entre Teste de Software e Depuração(Debbuging)
A principal diferença entre o teste e a depuração é que o teste é o processo de identificar defeitos do software, enquanto a depuração é o processo de localizar os defeitos identificados.

## Casos de Teste
### O que é um caso de teste?
### Particionamento de Equivalência
Separação do domínio de informação em classes representativas, considerando que cada membro da mesma classe é processado de forma equivalente. Em outras palavras, agrupamento de casos de testes em classes de domínio pertencentes ao domínio de entrada e de saída, onde todos os membros de uma classe possuam características semelhantes.
Ex: Para testar um método que realiza o cálculo de potência, podemos definir duas, dentre várias, classes de equivalência, sendo elas C1 = {*base positiva e expoente positivo maior que 0*} e C2 = {*base positiva e expoente negativo*}. Como representantes dessas classes, teríamos por exemplo:
*considere a tupla (x,y) onde x é a base e y é o expoente*
C1 = {(2, 3), (4, 1)}
C2 = {(5, -2), (12, -3)}

## Técnicas de Teste
### Teste Funcional - Caixa Preta
Para utilizar a abordagem funcional para elaborar os casos de testes, é necessário saber o objetivo do código, isto é, quais são os dados de entrada e resultados esperados.
A fonte utilizada para definir os casos de testes são os requisito, ou seja, o código fonte é abstraído, levando em consideração somente o necessário implementar casos de testes automatizados.

### Teste Estrutural - Caixa Branca(Caixa de vidro)
A implementação do código fonte é levada em consideração para definir os casos de testes.
Para elaborar casos de testes usando essa abordagem, é levado em consideração o fluxo de execução do código, estruturas condicionais e de controle, loopings, etc.

## Níveis de Teste
### Teste Unitário
É uma modalidade de testes que se concentra na verificação da menor unidade do projeto de software. É realizado o teste de uma unidade lógica, com uso de dados suficientes para se testar apenas à lógica da unidade em questão.
Em sistemas construídos com uso de linguagens orientadas a objetos, essa unidade pode ser identificada como um método, uma classe ou mesmo um objeto.
### Teste de Integração
É a fase do teste de software em que módulos são combinados e testados em grupo
### Teste de Sistema
É a fase em que o sistema completo (integrado) é testado num ambiente que simula o ambiente de produção.
