public class TestaAquario {
    public static void main(String[] args){
        Aquario aquario = new Aquario();
        Peixe peixe1 = new Peixe("Betta", 6);
        Peixe peixe2 = new Peixe("Betta", 6);
        Peixe peixe3 = new Peixe("Koi", 20);
        Peixe peixe4 = new Peixe("Kinguio", 10);
        Peixe peixe5 = new Peixe("Axolote", 23);

        aquario.adicionaPeixe(peixe1);
        aquario.adicionaPeixe(peixe2);
        aquario.adicionaPeixe(peixe3);
        aquario.adicionaPeixe(peixe4);
        aquario.adicionaPeixe(peixe5);

        aquario.imprimePeixe();
        System.out.println("---------");
        System.out.println("Indice Peixe 1: " + aquario.buscaPeixe(peixe1));
        System.out.println("---------");
        System.out.println("Removendo " + peixe4);
        aquario.excluiPeixe(2);
        System.out.println("---------");
        aquario.imprimePeixe();
    }
}
