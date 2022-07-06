public class Caderno {
    private int numMaterias, numFolhas, idCaderno;
    private double precoCaderno;

    Caderno(int numMaterias, int numFolhas, int idCaderno, double precoCaderno){
        setNumMaterias(numMaterias);
        setNumFolhas(numFolhas);
        setIdCaderno(idCaderno);
        setPrecoCaderno(precoCaderno);
    }
    int getNumMaterias(){
        return this.numMaterias;
    }
    void setNumMaterias(int numMaterias){
        if (numMaterias > 0)
            this.numMaterias = numMaterias;
        else this.numMaterias = 1;
    }
    int getNumFolhas(){
        return numFolhas;
    }
    void setNumFolhas(int numFolhas){
        if (numFolhas > 0)
            this.numFolhas = numFolhas;
        else this.numFolhas = 1;
    }
    int getIdCaderno(){
        return this.idCaderno;
    }
    void setIdCaderno(int idCaderno){
        if (idCaderno > 0)
            this.idCaderno = idCaderno;
        else this.idCaderno = 1;
    }
    double getPrecoCaderno(){
        return this.precoCaderno;
    }
    void setPrecoCaderno(double precoCaderno) {
        if (precoCaderno > 0)
            this.precoCaderno = precoCaderno;
        else this.precoCaderno = 1;
    }
    @Override
    public String toString(){
        return "Caderno{numMaterias: " + this.numMaterias + ", numFolhas: " + this.numFolhas
                + ", idCaderno: " + this.idCaderno + ", precoCaderno: R$" + this.precoCaderno + "}";
    }
}
