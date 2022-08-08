## Atividade Livro e Ebook - Herança
Desenvolva em Java uma classe Livro que contenha os atributos nome (String), descricao (String), valor (float),  autor (Autor) e descontoRealizado (boolean).

O valor de um objeto do tipo Livro poderá ser alterado por meio de um método que concede um desconto enviado por parâmetro. Esse desconto não poderá ultrapassar 15% e somente poderá ser realizado uma única vez para cada instância.  Para garantir que o mesmo seja realizado apenas uma única vez existe o atributo booleano descontoRealizado que pode ser verificado antes de realizar um desconto. 

O desconto para um objeto do tipo Livro irá alterar o valor do mesmo e deve ser realizado por meio do método boolean aplicaDesconto (float porcentagem)

-------------------------------------------------------------------

Desenvolva também uma classe EBook que é filha da classe Livro. A única diferença entre as duas classes está no método aplicaDesconto. Para a classe EBook, o desconto informado por parâmetro pode chegar a até 30%.  

-------------------------------------------------------------------

Todo Livro possui um parâmetro do tipo Autor.  Desenvolva uma classe Autor de acordo com o diagrama. 

------------------------------------------------------------------

Por último, desenvolva uma classe TestaLivro que crie um determinado Livro e um EBook. Realize dois descontos em cada uma das instâncias e imprima as mesmas. 