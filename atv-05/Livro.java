public class Livro {
    String nome, descricao;
    float valor;
    Autor autor;
    boolean descontoRealizado = false;
    Livro(String nome, String descricao, float valor, Autor autor){
        setNome(nome);
        setDescricao(descricao);
        setValor(valor);
        setAutor(autor);
    }
    public boolean aplicaDesconto(float porcentagem){
        if (porcentagem <= 15 && !descontoRealizado){
            this.valor -= this.valor * (porcentagem/100);
            descontoRealizado = true;
            return true;
        }
        else return false;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setValor(float valor){
        if (valor >= 1) this.valor = valor;
        else this.valor = 1;
    }
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public float getValor() {
        return valor;
    }
    public Autor getAutor() {
        return autor;
    }
    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nDescricao: " + this.descricao
                + autor.toString() + "\nValor: " + this.valor
                + "\nDesconto aplicado: " + descontoRealizado;
    }
}
