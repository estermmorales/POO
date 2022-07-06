## Avaliação 1 - Conta Telefone
Escreva uma classe em JAVA chamada de ContaTelefone. A classe deve possuir como atributo a quantidade de minutos falados pelo usuário.
<br>
A classe deve possuir um método que calcula a conta de um telefone celular (método float calculaConta) com base nos minutos falados e com os seguintes planos:
<ul>
    <li>Abaixo de 200 minutos, a empresa cobre R$0,20 por minuto</li>
    <li>Entre 200 e 400 minutos, o preço é de R$ 0,18 por minuto</li>
    <li>Acima de 200 minutos, o preço por minuto é de R$ 0,15</li>
</ul>

A classe deve possuir também um método que calcula o valor de um desconto de 10% para quando a conta é paga com antecedência (float calculaDesconto). Esse método não possui parâmetro e deve apenas devolver o valor de 10% da conta que é calculada pelo método calculaConta().
<br>
A classe deve ainda possuir os seguintes métodos:
<ul>
    <li>Cosntrutor que recebe a quantidade de minutos como parâmetro</li>
    <li>void SetMinutos (int min) que deve inicializar o atributo minutos de maneira que o mesmo seja sempre maior ou igual a 0 (zero) (não permitir que o atributo minutos receba valores negativos)</li>
    <li>public String toString() que deve retornar uma String informando a quantidade de minutos e o valor da conta</li>
    <li>public boolean equals (Object o) que deve comparar se dois objetos são iguais</li>
</ul>
<br>
Não é necessário desenvolver a classe de Teste.
