# Testes Automatizados
Laboratórios desenvolvidos durante a disciplina de Teste de Software

## Teste de Software
A prevenção e o fornecimento de diagnósticos claros para correção de erros, e a identificação dos sintomas provocados por bugs são os principais objetivos dos testes de software. 

### O que é testar?
- É executar um programa com o objetivo de validar seu comportamento dinâmico.
- É checar se o software é realmente o que o usuário quer.

### Porque testar?
Além de assegurar a qualidade do software, a prática de testes reduz de forma considerável custos, geralmente altos, que são consequências de falhas de software.

### Diferença entre Teste de Software e Debbuging

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
