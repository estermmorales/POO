public class Animal {
    private double peso, altura, largura;
    private String especie, cor;

    Animal(double peso, String especie, double altura, double largura, String cor){
        setPeso(peso);
        setEspecie(especie);
        setAltura(altura);
        setLargura(largura);
        setCor(cor);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0)
            this.peso = peso;
        else this.peso = 1;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0)
            this.altura = altura;
        else this.altura = 1;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0)
            this.largura = largura;
        else this.largura = 1;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString(){
        return "Animal{" + "Peso: " + this.peso + ", Especie: " + this.especie
                + ", Altura: " + this.altura + ", Largura: " + this.largura
                + ", Cor: " + this.cor + "}";
    }
    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (!(o instanceof Animal))
            return false;
        Animal animal = (Animal) o;
        return this.peso == animal.peso && this.especie.equals(animal.especie)
                && this.altura == animal.altura && this.largura == animal.largura
                && this.cor.equals(animal.cor);
    }
}
