public class EBook extends Livro {
    EBook(String nome, String descricao, float valor, Autor autor) {
        super(nome, descricao, valor, autor);
    }
    public boolean aplicaDesconto(float porcentagem){
        if (porcentagem <= 30 && !descontoRealizado){
            this.valor -= this.valor * (porcentagem/100);
            descontoRealizado = true;
            return true;
        }
        else return false;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
