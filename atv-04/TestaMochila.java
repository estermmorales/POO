public class TestaMochila {
    public static void main(String[] args){
        Caderno caderno = new Caderno(20, 300, 8, 30.5);
        Estojo estojo = new Estojo(100, 8, 100.0);
        Mochila mochila = new Mochila(caderno, estojo, 300.0);
        System.out.println(mochila);
    }
}
