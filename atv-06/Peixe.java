public class Peixe {
    private String especie;
    private double comprimento;

    Peixe(String especie, double comprimento){
        this.especie = especie;
        this.comprimento = comprimento;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    @Override
    public String toString(){
        return "Peixe{Especie='" + this.getEspecie() + "', Comprimento='" + this.getComprimento()
        + "'}";
    }
    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (!(o instanceof Peixe))
            return false;
        Peixe peixe = (Peixe) o;
        return peixe.especie.equals(this.especie) && peixe.comprimento == this.comprimento;
    }
}
