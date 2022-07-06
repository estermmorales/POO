public class Mochila {
    private Caderno caderno;
    private Estojo estojo;
    private double precoMochila;

    Mochila(Caderno caderno, Estojo estojo, double precoMochila){
        this.caderno = caderno;
        this.estojo = estojo;
        setPrecoMochila(precoMochila);
    }
    double getPrecoMochila(){
        return this.precoMochila;
    }
    void setPrecoMochila(double precoMochila){
        if (precoMochila > 0)
            this.precoMochila = precoMochila;
        else this.precoMochila = 1;
    }
    double precoTotalComponentes(){
        return  (caderno.getPrecoCaderno() + estojo.getPrecoEstojo() + getPrecoMochila());
    }
    @Override
    public String toString(){
        return "Mochila possui:" + "\n" + this.caderno + "\n" + this.estojo
                + "\nPreço Mochila: R$" + this.precoMochila
                + "\nPreço Total Componentes: R$" + this.precoTotalComponentes();
    }
}
