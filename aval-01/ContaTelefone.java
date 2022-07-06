public class ContaTelefone {
    int minutos;
    ContaTelefone(int minutos){
        setMinutos(minutos);
    }
    void setMinutos(int minutos){
        if (minutos >= 0)
            this.minutos = minutos;
        else this.minutos = 0;
    }
    float calculaConta(){
        if (minutos < 200)
            return minutos * 0.20f;
        else if (minutos <= 400)
            return minutos * 0.18f;
        else 
            return minutos * 0.15f;
    }
    float calculaDesconto(){
        return calculaConta() * 0.10f;
    }
    @Override
    public String toString(){
        return "Minutos: " + minutos + "\nValor da conta: " + calculaConta();
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof ContaTelefone))
            return false;
        ContaTelefone conta = (ContaTelefone) o;
        return this.minutos == conta.minutos;
    }
}