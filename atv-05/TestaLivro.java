public class TestaLivro {
    public static void main(String[] args){
        Livro livro = new Livro("Livro A", "Livro para ler", 15.00f, new Autor("Joao", "Silva"));
        Livro ebook = new EBook("Ebook A", "Ebook para ler", 5.00f, new Autor("Maria", "Santos"));
        livro.aplicaDesconto(10);
        livro.aplicaDesconto(15);
        ebook.aplicaDesconto(2);
        ebook.aplicaDesconto(30);
        System.out.println(livro);
        System.out.println("-------");
        System.out.println(ebook);
    }
}
