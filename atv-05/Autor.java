public class Autor {
    String nome, sobrenome;
    Autor(String nome, String sobrenome){
        setNome(nome);
        setSobrenome(sobrenome);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome= sobrenome;
    }
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    @Override
    public String toString(){
        return "\nAutor: " + this.nome + " " + this.sobrenome;
    }
}
