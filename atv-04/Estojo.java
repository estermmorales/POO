public class Estojo {
    private int quantidadeMateriais, idEstojo;
    private double precoEstojo;

    public Estojo(int quantidadeMateriais, int idEstojo, double precoEstojo) {
        setQuantidadeMateriais(quantidadeMateriais);
        setIdEstojo(idEstojo);
        setPrecoEstojo(precoEstojo);
    }

    public int getQuantidadeMateriais() {
        return quantidadeMateriais;
    }

    public void setQuantidadeMateriais(int quantidadeMateriais) {
        if (quantidadeMateriais > 0)
            this.quantidadeMateriais = quantidadeMateriais;
        else
            this.quantidadeMateriais = 1;
    }

    public int getIdEstojo() {
        return idEstojo;
    }

    public void setIdEstojo(int idEstojo) {
        if (idEstojo > 0)
            this.idEstojo = idEstojo;
        else this.idEstojo = 1;
    }

    public double getPrecoEstojo() {
        return precoEstojo;
    }

    public void setPrecoEstojo(double precoEstojo) {
        if (precoEstojo > 0)
            this.precoEstojo = precoEstojo;
        else this.precoEstojo = 1;
    }
    @Override
    public String toString(){
        return "Estojo{quantidadesMateriais: " + this.quantidadeMateriais + ", idEstojo: " + this.idEstojo
                + ", precoEstojo: R$" + this.precoEstojo + "}";
    }
}
