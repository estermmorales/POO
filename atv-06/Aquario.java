import java.util.ArrayList;

public class Aquario {
    private ArrayList<Peixe> listaDePeixes= new ArrayList<>();

    Aquario(){}
    public int buscaPeixe(Peixe peixe){
        for (int i = 0; i< this.listaDePeixes.size(); i++){
            Peixe aux = this.listaDePeixes.get(i);
            if (aux.equals(peixe))
                return i;
        }
        return -1;
    }
    public void adicionaPeixe(Peixe peixe){
        if (this.buscaPeixe(peixe) == -1)
            this.listaDePeixes.add(peixe);
    }
    public void imprimePeixe(){
        System.out.println();
        if (this.listaDePeixes.isEmpty()) System.out.println(this.getClass() + " ainda não possui peixes");
        else
            for (Peixe peixe : this.listaDePeixes)
                System.out.println(peixe);
    }
    public void excluiPeixe(int indicePeixe){
        Peixe indice = this.listaDePeixes.get(indicePeixe);
        if (listaDePeixes.contains(indice))
            this.listaDePeixes.remove(indice);
    }
}
